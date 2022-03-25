require_relative 'TipoAgente'
require_relative 'Excepciones/Error_TipoAgente_NoExiste'
require_relative 'Excepciones/Error_TipoAgente_Existe'
require_relative 'Excepciones/Error_Agente_Propiedades'
require_relative 'Excepciones/Error_NombreAgente_Existe'
require_relative 'Excepciones/Error_Simulacion'
require_relative 'Agente'
require_relative 'Regla'
require_relative 'Condiciones/CondicionAgenteA'
require_relative 'Condiciones/CondicionPropiedad'
require_relative 'Acciones/AccionCrearAgente'
require_relative 'Acciones/AccionMoverseA'
require_relative 'Acciones/AccionModificarValor'

class Sistema
  def initialize(nombre)
    @nombre = nombre
    @tiposAgentes = []
    @agentes = []
    @@num_agente_crear = 1
  end

  def addTipoAgente(tpAgente)
    @tiposAgentes << tpAgente
  end

  def addAgente(agente)
    @agentes << agente
  end

  def removeAgente(agente)
    @agentes.delete(agente)
  end

  def getTipoAgente(tipo)
    @tiposAgentes.each do |t|
      if t.nombre == tipo.to_s
        return t
      end
    end
    raise Error_TipoAgente_NoExiste.new(tipo), "El tipo agente #{tipo} no existe\n"
  end

  def findTipoAgente(nombre)
    @tiposAgentes.each do |t|
      if t.nombre == nombre.to_s
        raise Error_TipoAgente_Existe.new(nombre), "El tipo agente #{nombre} ya existe\n"
      end
    end
    false
  end

  def findAgenteNombre(nombre)
    @agentes.each do |a|
      if a.nombre == nombre.to_s
        raise Error_NombreAgente_Existe.new, "El agente con nombre #{nombre} ya existe\n"
      end
    end
    false
  end

  def simular(tamanio, pasos)
    raise Error_Simulacion.new, "Error, el tamaño #{tamanio} es incorrecto para realizar la simulación\n" if tamanio*tamanio <= num_agentes
    raise Error_Simulacion.new, "Error, número de pasos insuficiente para realizar la simulación\n" if pasos == 0

    @tamanio_mapa = tamanio

    @agentes.each do |a|
      colocarAgente(a)
    end

    #Posiciones iniciales
    saveInfo(0)

    puts 'Inicio simulación'
    i = 0
    reglas_disp = true
    while i < pasos && reglas_disp
      puts "Paso #{(i+1).to_s}"
      mostrarPosicionesAct
      r_disp = false
      @agentes.each do |a|
        reglasApl = getReglasApl(a)
        if !reglasApl.empty?
          applyAccion(reglasApl, a)
          r_disp = true
        end
      end
      reglas_disp = r_disp
      saveInfo(i + 1)
      i += 1
    end
    puts 'No hay reglas para aplicar' if !reglas_disp
    puts 'Fin simulación'
  end

  def mostrarPosicionesAct
    puts "* Posiciones iniciales *"
    @agentes.each do |a|
      puts "Agente: #{a.nombre}. Posición inicial: [#{a._x}, #{a._y}]"
    end
  end

  def getReglasApl(a)
    reglas = []
    a.reglas.each do |r|
      if r.num_condiciones.zero?
        reglas << r
        puts "Regla: #{r.nombre} aplicable para agente #{a.nombre}"
      end
      r.condiciones.each do |c|
        if isAplicable(a, c)
          puts "Regla: #{r.nombre} aplicable para agente #{a.nombre}"
          reglas << r
        end
      end
    end
    reglas
  end

  def colocarAgente(a)
    row = rand(@tamanio_mapa)
    col = rand(@tamanio_mapa)
    a.setCoordenadas(row, col)
  end

  def isAplicable(agente, condicion)
    cond_ok = false
    if condicion.instance_of? CondicionAgenteA
      tipo = condicion.tipo
      distancia = condicion.distancia
      x_a = agente._x
      y_a = agente._y

      #este
      if (distancia + y_a) >= @tamanio_mapa
        y_nuevo = (y_a + distancia)%@tamanio_mapa
        if agenteInPos(x_a, y_nuevo, tipo, agente.nombre)
          cond_ok = true
        end
      else
        if agenteInPos(x_a, (distancia + y_a), tipo, agente.nombre)
          cond_ok = true
        end
      end

      #sur
      if (distancia + x_a) >= @tamanio_mapa
        x_nuevo = (x_a + distancia)%@tamanio_mapa
        if agenteInPos(x_nuevo, y_a, tipo, agente.nombre)
          cond_ok = true
        end
      else
        if agenteInPos((distancia + x_a), y_a, tipo, agente.nombre)
          cond_ok = true
        end
      end

      #oeste
      if (y_a - distancia).negative?
        if (y_a - distancia).abs < @tamanio_mapa
          y_nuevo = @tamanio_mapa - (y_a - distancia).abs
          if agenteInPos(x_a, y_nuevo, tipo, agente.nombre)
            cond_ok = true
          end
        else
          desplazamiento = distancia%@tamanio_mapa
          if (y_a - desplazamiento) < @tamanio_mapa
            abs = (y_a - desplazamiento).abs
            y_nuevo = @tamanio_mapa - abs if abs != 0
            y_nuevo = 0 if abs == 0
          else
            y_nuevo = y_a - desplazamiento
          end
          if agenteInPos(x_a, y_nuevo, tipo, agente.nombre)
            cond_ok = true
          end
        end
      else
        y_nuevo = y_a - distancia
        if agenteInPos(x_a, y_nuevo, tipo, agente.nombre)
          cond_ok = true
        end
      end

      #norte
      if (x_a - distancia).negative?
        if (x_a - distancia).abs < @tamanio_mapa
          x_nuevo = @tamanio_mapa - (x_a - distancia).abs
          if agenteInPos(x_nuevo, y_a, tipo, agente.nombre)
            cond_ok = true
          end
        else
          desplazamiento = distancia%@tamanio_mapa
          if (x_a - desplazamiento) < @tamanio_mapa
            abs = (x_a - desplazamiento).abs
            x_nuevo = @tamanio_mapa - abs if abs != 0
            x_nuevo = 0 if abs == 0
          else
            x_nuevo = x_a - desplazamiento
          end
          if agenteInPos(x_nuevo, y_a, tipo, agente.nombre)
            cond_ok = true
          end
        end
      else
        x_nuevo = x_a - distancia
        if agenteInPos(x_nuevo, y_a, tipo, agente.nombre)
          cond_ok = true
        end
      end

    else
      valor = condicion.valor
      propiedad = condicion.propiedad
      operacion = condicion.operacion

      valorA = agente.getValor(propiedad)
      cond_ok = case operacion
      when :igual
        valor = valor.to_s if valor.instance_of? Symbol
        valorA = valorA.to_s if valorA.instance_of? Symbol
        (valor == valorA)
      when :mayor
        (valorA > valor)
      else
        (valorA < valor)
                end
    end
    cond_ok
  end

  def agenteInPos(x, y, tipo, nombre)
    agente_ok = false
    @agentes.each do |a|
      x_a = a._x
      y_a = a._y
      tipo_a = a.tipoAgente.nombre
      agente_ok = true if x_a == x && y_a == y && tipo_a == tipo && a.nombre != nombre
    end
    agente_ok
  end

  def applyAccion(reglas, agente)
    regla_seleccionada = rand(reglas.length)
    regla = reglas[regla_seleccionada]
    puts "Ejecutando regla #{regla.nombre.to_s} para el agente #{agente.nombre.to_s}"
    regla.acciones.each do |a|
      if a.instance_of? AccionCrearAgente
        puts "Aplicando acción AccionCrearAgente para el agente #{agente.nombre.to_s}"
        tipo = a.tipo
        propiedades = a.propiedades
        nombre = "tipo_#{tipo.nombre.to_s}#{@@num_agente_crear.to_s}"
        @@num_agente_crear += 1
        new_a = Agente.new(nombre, tipo)
        propiedades.each do |key, value|
          new_a.setPropiedadValor(key, value)
        end
        addAgente(new_a)
        colocarAgente(new_a)

        puts "-> Nuevo agente. Nombre: #{nombre}. Tipo: #{tipo.nombre}. Posición: [#{new_a._x} , #{new_a._y}]"
      elsif a.instance_of? AccionModificarValor
        valor = a.valor
        propiedad = a.propiedad
        operacion = a.operacion

        puts "Aplicando acción AccionModificarValor para el agente #{agente.nombre.to_s}"
        puts "-> #{operacion.to_s} #{valor.to_s} a #{propiedad.to_s}"

        case operacion
        when :restar
          v = agente.getValor(propiedad)
          new_v = v - valor
          agente.setPropiedadValor(propiedad, new_v)
          puts "-> Nuevo valor: #{new_v}"
        when :sumar
          v = agente.getValor(propiedad)
          new_v = v + valor
          agente.setPropiedadValor(propiedad, new_v)
          puts "-> Nuevo valor: #{new_v}"
        else
          agente.setPropiedadValor(propiedad, valor)
        end
      else
        applyMovimiento(a, agente)
      end
    end
  end

  def applyMovimiento(acc, agente)
    x_a = agente._x
    y_a = agente._y
    distancia = acc.desplazamiento
    direccion = acc.direccion

    puts "Aplicando acción AccionMoverseA para el agente #{agente.nombre.to_s}"

    if direccion == :aleatorio
      direcciones = [:norte, :sur, :este, :oeste]
      direccion = direcciones[rand(direcciones.size)]
    end

    puts "-> #{direccion.to_s} #{distancia.to_s} unidades "

    if direccion == :este
      #este
      if (distancia + y_a) >= @tamanio_mapa
        y_nuevo = (y_a + distancia)%@tamanio_mapa
        agente.setCoordenadas(x_a, y_nuevo)
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_a}, #{y_nuevo}]"
      else
        agente.setCoordenadas(x_a, (distancia + y_a))
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_a}, #{(distancia + y_a)}]"
      end
    elsif direccion == :sur
      #sur
      if (distancia + x_a) >= @tamanio_mapa
        x_nuevo = (x_a + distancia)%@tamanio_mapa
        agente.setCoordenadas(x_nuevo, y_a)
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_nuevo}, #{y_a}]"
      else
        agente.setCoordenadas((distancia + x_a), y_a)
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{(distancia + x_a)}, #{y_a}]"
      end
    elsif direccion == :oeste
      #oeste
      if (y_a - distancia).negative?
        if (y_a - distancia).abs < @tamanio_mapa
          y_nuevo = @tamanio_mapa - (y_a - distancia).abs
          agente.setCoordenadas(x_a, y_nuevo)
          puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_a}, #{y_nuevo}]"
        else
          desplazamiento = distancia%@tamanio_mapa
          if (y_a - desplazamiento) < @tamanio_mapa
            abs = (y_a - desplazamiento).abs
            y_nuevo = @tamanio_mapa - abs if abs != 0
            y_nuevo = 0 if abs == 0
          else
            y_nuevo = y_a - desplazamiento
          end
          agente.setCoordenadas(x_a, y_nuevo)
          puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_a}, #{y_nuevo}]"
        end
      else
        y_nuevo = y_a - distancia
        agente.setCoordenadas(x_a, y_nuevo)
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_a}, #{y_nuevo}]"
      end
    else
      #norte
      if (x_a - distancia).negative?
        if (x_a - distancia).abs < @tamanio_mapa
          x_nuevo = @tamanio_mapa - (x_a - distancia).abs
          agente.setCoordenadas(x_nuevo, y_a)
          puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_nuevo}, #{y_a}]"
        else
          desplazamiento = distancia%@tamanio_mapa
          if (x_a - desplazamiento) < @tamanio_mapa
            abs = (x_a - desplazamiento).abs
            x_nuevo = @tamanio_mapa - abs if abs != 0
            x_nuevo = 0 if abs == 0
          else
            x_nuevo = x_a - desplazamiento
          end
          agente.setCoordenadas(x_nuevo, y_a)
          puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_nuevo}, #{y_a}]"
        end
      else
        x_nuevo = x_a - distancia
        agente.setCoordenadas(x_nuevo, y_a)
        puts "-> Inicial: [#{x_a}, #{y_a}]. Final: [#{x_nuevo}, #{y_a}]"
      end
    end
  end

  def saveInfo(paso)
    modo = if paso.zero?
    'w'
    else
    'a'
    end
    File.open('salidaSimulacion.txt', modo) do |f|
      f.puts "Paso #{paso}"
      @agentes.each do |a|
        f.puts "Agente #{a.nombre} -> Posición: [#{a._x}, #{a._y}]"
      end
    end
  end

  def num_tpAgentes
    @tiposAgentes.size
  end

  def num_agentes
    @agentes.size
  end

  def getTpAgente(pos)
    @tiposAgentes[pos]
  end

  def getAgente(pos)
    @agentes[pos]
  end

  def to_s
    puts "Sistema: #{@nombre}"
    puts "-> Tipos de Agentes <-"
    (@tiposAgentes.each do |t|
      t.to_s
    end).to_s

    puts "-> Agentes <-"
    (@agentes.each do |a|
      a.to_s
    end).to_s
  end
end
