require_relative 'Criterio_busqueda_error'
require_relative 'Sin_servicios_busqueda_error'
require_relative 'ActGrupal'

class Buscador_servicios
  def initialize(identificador, codigo, horario, listServicios, listIntercambios)
    # Error si no se ha introducido ningun cirterio de busqueda
    if identificador.length == 1 and codigo.length == 1 and horario.length == 1
      raise Criterio_busqueda_error, "No se le han pasado criterios de busqueda al buscador de servicios\n"
    end
    if identificador.length == 1
      identificador = nil
    else
      @identificador = identificador[0, identificador.length - 1] # Hay que quitar el ultimo valor correspondiente al del usuario al pulsar enter
    end
    if codigo.length == 1
      codigo = nil
    else
      @codigo = codigo[0, codigo.length - 1] # Hay que quitar el ultimo valor correspondiente al del usuario al pulsar enter
    end
    if horario.length == 1
      dias = nil
      hora_ini = nil
      hora_fin = nil
    else
      hora_ini = horario[horario.length() -3, horario.length - 1].to_i
      hora_fin = horario[horario.length() -8, 2].to_i
      dias = horario[0, horario.length() - 12]
      dias = dias.split(",")
    end
    # Error si no se ha introducido servicios sobre los que buscar
    if listServicios == nil
      raise Sin_servicios_busqueda_error, "No se le han pasado servicios sobre los que buscar al buscador de servicios\n"
    end
    if listIntercambios == nil
      raise Sin_intercambios_busqueda_error, "No se le han pasado los intercambios sobre los que buscar al buscador de servicios\n"
    end
    @dias = dias
    @hora_ini = hora_ini
    @hora_fin = hora_fin
    @listServicios = listServicios  
    @listIntercambios = listIntercambios
  end
  
  attr_accessor :identificador, :codigo, :dias, :hora_ini, :hora_fin, :listServicios, :listIntercambios
  
  def busqueda_numero_intercambios
    servicios_encontrados = self.busqueda()
    array_servicio_intercambios = {}
    servicios_encontrados.each do |servicio_encontrado|
      array_servicio_intercambios.store(servicio_encontrado, 0)
      @listIntercambios.each do |intercambio|
        if intercambio.servicio == servicio_encontrado
          if array_servicio_intercambios.has_key?(servicio_encontrado)
            array_servicio_intercambios.store(servicio_encontrado, array_servicio_intercambios[servicio_encontrado] + 1)
          else
            array_servicio_intercambios.store(servicio_encontrado, 1)
          end
        end
      end
    end
    array_servicio_intercambios = array_servicio_intercambios.sort_by{ |servicio, intercambios| intercambios }.reverse()
  end
  
  def busqueda_saldo
    servicios_encontrados = self.busqueda()
    servicios_encontrados.sort_by{|servicio_encontrado| servicio_encontrado.socio.saldo}.reverse()
  end
  
  def busqueda()
    
    # Busqueda de servicios por identificador dividido en dos tramos
    list_servicios_encontrados_criterio1 = Array.new
    if @identificador != nil
      # Busqueda servicios de actividades grupales donde alguno de los colaboradores coincidan con el identificador
      servicios_aux1 = @listServicios.select{|servicio| servicio.class.name == ('ActGrupal')}
      servicios_aux1.each do |servicio|
        colaboradores = servicio.colaboradores
        colaboradores.each do |colaborador|
          if colaborador.identificador == @identificador
            list_servicios_encontrados_criterio1.append(servicio)
          end      
        end
      end
      # Busqueda de servicios donde el socio coincida con el identificador
      servicios_aux1 = @listServicios.select{|servicio| servicio.socio.identificador == @identificador}
      list_servicios_encontrados_criterio1 = list_servicios_encontrados_criterio1.concat(servicios_aux1)
    else
      list_servicios_encontrados_criterio1 = @listServicios 
    end
    
    # Busqueda de servicios por codigo de categoria dividido en dos tramos
    list_servicios_encontrados_criterio2 = Array.new
    if @codigo != nil
      # Busqueda por codigo para Actividades grupales y servicios basicos
      servicios_aux1 = @listServicios.reject{|servicio| servicio.class.name == ('SCombo')}
      servicios_aux1 = servicios_aux1.select{|servicio| servicio.categoria.codigo == @codigo}
      list_servicios_encontrados_criterio2.concat(servicios_aux1)
      # Busqueda por codigo para servicios combo
      servicios_aux1 = @listServicios.select{|servicio| servicio.class.name == ('SCombo')}
      servicios_aux1.each do |servicio_combo|
        conjunto_servicios_basicos = servicio_combo.conjunto_servicios_basicos()
        conjunto_servicios_basicos.each do |servicio_basico|
          if servicio_basico.categoria.codigo == @codigo
            list_servicios_encontrados_criterio2.append(servicio_combo)
          end
        end
      end 
    else
      list_servicios_encontrados_criterio2 = @listServicios 
    end
    
    # Busqueda de servicios por horario dividido en dos tramos
    list_servicios_encontrados_criterio3 = Array.new
    if @dias != nil
      # Busqueda por horario para Actividades grupales y servicios basicos
      servicios_aux1 = @listServicios.reject{|servicio| servicio.class.name == ('SCombo')}
      servicios_aux1.each do |servicio|
        if servicio.class.name == 'SBasico'
          interseccion_dias = @dias.intersection(servicio.dias)
          if (@hora_ini >= servicio.horaIni) and (@hora_fin <= servicio.horaFin) and (interseccion_dias.length == servicio.dias.length)
            list_servicios_encontrados_criterio3.append(servicio)
          end
        else
          interseccion_dias = Array.new
          interseccion_dias = interseccion_dias.append(servicio.dia)
          interseccion_dias = @dias.intersection(interseccion_dias)
          if (@hora_ini >= servicio.horaIni) and (@hora_fin <= servicio.horaFin) and (interseccion_dias.length == 1)
            list_servicios_encontrados_criterio3.append(servicio)
          end
        end  
      end
      # Busqueda para servicios combo
      servicios_combo = @listServicios.select{|servicio| servicio.class.name == ('SCombo')}
      servicios_combo.each do |servicio_combo|
        servicios_basicos_combo = Array.new()
        servicios_basicos_combo.concat(servicio_combo.conjunto_servicios_basicos())
        flag = 1  # Flag para saber si todos los servicios basicos de un servicio combo cumplen con las condiciones de horario
        servicios_basicos_combo.each do |servicio|
          interseccion_dias = @dias.intersection(servicio.dias)
          if (@hora_ini < servicio.horaIni) or (@hora_fin > servicio.horaFin) or (@dias.intersection(servicio.dias).length != servicio.dias.length)
            flag = 0
          end
        end
        if flag == 1
          list_servicios_encontrados_criterio3.append(servicio_combo)
        end
      end
    else
      list_servicios_encontrados_criterio3 = @listServicios 
    end
    # Interseccion de las 3 busquedas, ya que deben concidir los 3 criterios para la busqueda, con union se eliminan duplicados
    return list_servicios_encontrados_criterio1.union([]).intersection(list_servicios_encontrados_criterio2).union([]).intersection(list_servicios_encontrados_criterio3).union([])
  end
end