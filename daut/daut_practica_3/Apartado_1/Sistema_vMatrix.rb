require_relative 'TipoAgente'
require_relative 'Excepciones/Error_TipoAgente_NoExiste'
require_relative 'Excepciones/Error_TipoAgente_Existe'
require_relative 'Excepciones/Error_Agente_Propiedades'
require_relative 'Excepciones/Error_NombreAgente_Existe'
require_relative 'Agente'
require_relative 'Regla'
require_relative 'Condiciones/CondicionAgenteA'
require_relative 'Condiciones/CondicionPropiedad'
require_relative 'Acciones/AccionCrearAgente'
require_relative 'Acciones/AccionMoverseA'
require_relative 'Acciones/AccionModificarValor'
require 'matrix'

class Sistema
  def initialize(nombre)
    @nombre = nombre
    @tiposAgentes = []
    @agentes = []
    @mapa
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
      if t.nombre == tipo
        return t
      end
    end
    raise Error_TipoAgente_NoExiste.new(tipo), "El tipo agente #{tipo} no existe\n"
  end

  def findTipoAgente(nombre)
    @tiposAgentes.each do |t|
      if t.nombre == nombre
        raise Error_TipoAgente_Existe.new(nombre), "El tipo agente #{nombre} ya existe\n"
      end
    end
    false
  end

  def findAgenteNombre(nombre)
    @agentes.each do |a|
      if a.nombre == nombre
        raise Error_NombreAgente_Existe.new, "El agente con nombre #{nombre} ya existe\n"
      end
    end
    false
  end

  def simular(tamanio, pasos)
    if tamanio*tamanio <= num_agentes
      puts 'Tamaño pequeño'
    end
    @mapa = Matrix.zero(tamanio)
    @tamanio_mapa = tamanio

    @agentes.each do |a|
      colocarAgente(a)
    end
    #Posiciones iniciales
    saveInfo(0)

    i = 0
    reglas_disp = true
    while i < pasos && reglas_disp
      @agentes.each do |a|
        reglasApl = getReglasApl(a)
        reglas_disp = false if reglasApl.empty?
        if !reglasApl.empty?
          applyAccion(reglasApl, a)
          reglas_disp = true
        end
      end
      saveInfo(i + 1)
      i += 1
    end
    puts 'Fin simulación'
  end

  def getReglasApl(a)
    reglas = []
    a.reglas.each do |r|
      reglas << r if r.num_condiciones == 0
      r.condiciones.each do |c|
        if isAplicable(a, c)
          reglas << r
        end
      end
    end
    reglas
  end

  def colocarAgente(a)
    pos_ok = false
    until pos_ok do
      row = rand(@tamanio_mapa)
      col = rand(@tamanio_mapa)
      if @mapa[row, col] == 0
        @mapa[row, col] = a
        a.setCoordenadas(row, col)
        pos_ok = true
      end
    end
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
        if @mapa[x_a, y_nuevo] != 0
          cond_ok = true if @mapa[x_a, y_nuevo].tipoAgente.nombre == tipo
        end
      else
        if @mapa[x_a, (distancia + y_a)] != 0
          cond_ok = true if @mapa[x_a, (distancia + y_a)].tipoAgente.nombre == tipo
        end
      end

      #sur
      if (distancia + x_a) >= @tamanio_mapa
        x_nuevo = (x_a + distancia)%@tamanio_mapa
        if @mapa[x_nuevo, y_a] != 0
          cond_ok = true if @mapa[x_nuevo, y_a].tipoAgente.nombre == tipo
        end
      else
        if @mapa[(distancia + x_a), y_a] != 0
          cond_ok = true if @mapa[(distancia + x_a), y_a].tipoAgente.nombre == tipo
        end
      end

      #oeste
      if (y_a - distancia) < 0
        if (y_a - distancia).abs < @tamanio_mapa
          y_nuevo = @tamanio_mapa - (y_a - distancia).abs
          if @mapa[x_a, y_nuevo] != 0
            cond_ok = true if @mapa[x_a, y_nuevo].tipoAgente.nombre == tipo
          end
        else
          abs = (y_a - distancia).abs
          y_nuevo = abs%@tamanio_mapa
          if @mapa[x_a, y_nuevo] != 0
            cond_ok = true if @mapa[x_a, y_nuevo].tipoAgente.nombre == tipo
          end
        end
      else
        y_nuevo = y_a - distancia
        if @mapa[x_a, y_nuevo] != 0
          cond_ok = true if @mapa[x_a, y_nuevo].tipoAgente.nombre == tipo
        end
      end

      #norte
      if (x_a - distancia) < 0
        if (x_a - distancia).abs < @tamanio_mapa
          x_nuevo = @tamanio_mapa - (x_a - distancia).abs
          if @mapa[x_nuevo, y_a] != 0
            cond_ok = true if @mapa[x_nuevo, y_a].tipoAgente.nombre == tipo
          end
        else
          abs = (x_a - distancia).abs
          x_nuevo = abs%@tamanio_mapa
          if @mapa[x_nuevo, y_a] != 0
            cond_ok = true if @mapa[x_nuevo, y_a].tipoAgente.nombre == tipo
          end
        end
      else
        x_nuevo = x_a - distancia
        if @mapa[x_nuevo, y_a] != 0
          cond_ok = true if @mapa[x_nuevo, y_a].tipoAgente.nombre == tipo
        end
      end

    else
      valor = condicion.valor
      propiedad = condicion.propiedad
      operacion = condicion.operacion

      valorA = agente.getValor(propiedad)
      cond_ok = case operacion
                when :igual
                  (valor == valorA)
                when :mayor
                  (valor > valorA)
                else
                  (valor < valorA)
                end
    end
    cond_ok
  end

  def applyAccion(reglas, agente)
    regla_seleccionada = rand(reglas.length)
    regla = reglas[regla_seleccionada]

    regla.acciones.each do |a|
      if a.instance_of? AccionCrearAgente
        nombre = a.nombre
        tipo = a.tipo
        propiedades = a.propiedades

        new_a = Agente.new(nombre, tipo)
        propiedades.each do |key, value|
          new_a.setPropiedadValor(key, value)
        end
        addAgente(new_a)
        colocarAgente(new_a)
      elsif a.instance_of? AccionModificarValor
        valor = a.valor
        propiedad = a.propiedad
        operacion = a.operacion

        case operacion
        when :restar
          v = agente.getValor(propiedad)
          new_v = v - valor
          agente.setPropiedadValor(propiedad, new_v)
        when :sumar
          v = agente.getValor(propiedad)
          new_v = v + valor
          agente.setPropiedadValor(propiedad, new_v)
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

    if direccion == :aleatorio
      direcciones = [:norte, :sur, :este, :oeste]
      direccion = direcciones[rand(direcciones.size)]
    end

    if direccion == :este
      #este
      if (distancia + y_a) >= @tamanio_mapa
        y_nuevo = (y_a + distancia)%@tamanio_mapa
        if @mapa[x_a, y_nuevo] == 0
          @mapa[x_a, y_nuevo] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas(x_a, y_nuevo)
        end
      else
        if @mapa[x_a, (distancia + y_a)] == 0
          @mapa[x_a, (distancia + y_a)] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas(x_a, (distancia + y_a))
        end
      end
    elsif direccion == :sur
      #sur
      if (distancia + x_a) >= @tamanio_mapa
        x_nuevo = (x_a + distancia)%@tamanio_mapa
        if @mapa[x_nuevo, y_a] == 0
          @mapa[x_nuevo, y_a] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas(x_nuevo, y_a)
        end
      else
        if @mapa[(distancia + x_a), y_a] == 0
          @mapa[(distancia + x_a), y_a] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas((distancia + x_a), y_a)
        end
      end
    elsif direccion == :oeste
      #oeste
      if (y_a - distancia) < 0
        if (y_a - distancia).abs < @tamanio_mapa
          y_nuevo = @tamanio_mapa - (y_a - distancia).abs
          if @mapa[x_a, y_nuevo] == 0
            @mapa[x_a, y_nuevo] = agente
            @mapa[x_a, y_a] = 0
            agente.setCoordenadas(x_a, y_nuevo)
          end
        else
          abs = (y_a - distancia).abs
          y_nuevo = abs%@tamanio_mapa
          if @mapa[x_a, y_nuevo] == 0
            @mapa[x_a, y_nuevo] = agente
            @mapa[x_a, y_a] = 0
            agente.setCoordenadas(x_a, y_nuevo)
          end
        end
      else
        y_nuevo = y_a - distancia
        if @mapa[x_a, y_nuevo] == 0
          @mapa[x_a, y_nuevo] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas(x_a, y_nuevo)
        end
      end
    else
      #norte
      if (x_a - distancia) < 0
        if (x_a - distancia).abs < @tamanio_mapa
          x_nuevo = @tamanio_mapa - (x_a - distancia).abs
          if @mapa[x_nuevo, y_a] == 0
            @mapa[x_nuevo, y_a] = agente
            @mapa[x_a, y_a] = 0
            agente.setCoordenadas(x_nuevo, y_a)
          end
        else
          abs = (x_a - distancia).abs
          x_nuevo = abs%@tamanio_mapa
          if @mapa[x_nuevo, y_a] == 0
            @mapa[x_nuevo, y_a] = agente
            @mapa[x_a, y_a] = 0
            agente.setCoordenadas(x_nuevo, y_a)
          end
        end
      else
        x_nuevo = x_a - distancia
        if @mapa[x_nuevo, y_a] == 0
          @mapa[x_nuevo, y_a] = agente
          @mapa[x_a, y_a] = 0
          agente.setCoordenadas(x_nuevo, y_a)
        end
      end
    end
  end

  def showMapa
    puts @mapa.to_a.map(&:inspect)
  end

  def saveInfo(paso)
    modo = if paso == 0
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

