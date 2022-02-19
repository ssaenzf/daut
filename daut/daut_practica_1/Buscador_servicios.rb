require_relative 'Criterio_busqueda_error'
require_relative 'Sin_servicios_busqueda_error'
require_relative 'ActGrupal'

class Buscador_servicios
  def initialize(identificador, codigo, horario, listServicios)
    # Error si no se ha introducido ningun cirterio de busqueda
    if identificador.length == 1 and codigo.length == 1 and horario.length == 1
      raise Criterio_busqueda_error, "No se le han pasado criterios de busqueda al buscador de servicios\n"
    end
    if identificador.length == 1
      identificador = nil
    end
    if codigo.length == 1
      codigo = nil
    end
    if horario.length == 1
      dias = nil
    else
      hora_ini = horario[horario.length() -2, horario.length].to_i
      hora_fin = horario[horario.length() -7, horario.length].to_i
      dias = horario[0, horario.length() - 11]
      dias = dias.split(",")
    end
    # Error si no se ha introducido servicios sobre los que buscar
    if listServicios == nil
      raise Sin_servicios_busqueda_error, "No se le han pasado servicios sobre los que buscar al buscador de servicios\n"
    end
    @identificador = identificador[0, identificador.length - 1] # Hay que quitar el ultimo valor correspondiente al del usuario al pulsar enter
    @codigo = codigo[0, codigo.length - 1] # Hay que quitar el ultimo valor correspondiente al del usuario al pulsar enter
    @dias = dias
    @hora_ini = hora_ini
    @hora_fin = hora_fin
    @listServicios = listServicios   
  end
  
  attr_accessor :identificador, :codigo, :dias, :hora_ini, :hora_fin, :listServicios
  
  def busqueda_numero_intercambios
    pass
  end
  def busqueda_saldo
    pass
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
        if (@hora_ini >= servicio.horaIni) and (@hora_fin <= servicio.horaFin) and (@dias.intersection(servicio.dias).length == @dias.length)
          list_servicios_encontrados_criterio3.concat(servicio)
        end
      end
      # Busqueda para servicios combo
      servicios_aux1 = @listServicios.select{|servicio| servicio.class.name == ('SCombo')}
      servicios_aux2 = Array.new()
      servicios_aux1.each do |servicio|
        servicios_aux2.concat(servicio.conjunto_servicios_basicos())
      end 
      servicios_aux2.each do |servicio|
        if (@hora_ini >= servicio.horaIni) and (@hora_fin <= servicio.horaFin) and (@dias.intersection(servicio.dias).length == @dias.length)
          list_servicios_encontrados_criterio3.concat(servicio)
        end
      end
    else
      list_servicios_encontrados_criterio3 = @listServicios 
    end
    
    puts "list_servicios_encontrados_criterio1"
    puts list_servicios_encontrados_criterio1.union([]) # Correcto
    
    puts "list_servicios_encontrados_criterio2"
    puts list_servicios_encontrados_criterio2.union([]) # Correcto 
        
    puts "list_servicios_encontrados_criterio3"
    puts list_servicios_encontrados_criterio3.union([]) # Incorrecto
    # Interseccion de las 3 busquedas, ya que deben concidir los 3 criterios para la busqueda
    return list_servicios_encontrados_criterio1.intersection(list_servicios_encontrados_criterio2).intersection(list_servicios_encontrados_criterio3)
  end
end