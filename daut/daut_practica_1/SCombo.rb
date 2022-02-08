require_relative 'Servicio'
class SCombo < Servicio
  def initialize(descripcion, *servicios)
    super(descripcion)
    @listServicios = Array.new
    setServicios(servicios)
  end

  attr_accessor :listServicios, :descripcion

  def setServicios(servicios)
    listServicios = Array.new
    servicios.each do |s|
      if s.instance_of? ActGrupal
        puts("No se pueden añadir actividades grupales a un combo\n")
      elsif s.instance_of?SCombo
        combo_ok = true
        s.listServicios.each do |scombo|
          if listServicios.index(scombo.descripcion) != nil
            puts("Servicio #{scombo.descripcion} repetido\n")
            combo_ok = false
          else
            listServicios.append(scombo.descripcion)
          end
        end
        if combo_ok
          @listServicios.append(s)
        end
      else
        if listServicios.index(s.descripcion) != nil
          puts("Servicio #{s.descripcion} repetido\n")
        else
          listServicios.append(s.descripcion)
          @listServicios.append(s)
        end
      end
    end
  end

  def to_s()
    puts super.to_s + "Servicios: \n"

    @listServicios.each do |s|
      if s.instance_of?SCombo
        s.to_s
      else
        puts s.to_s
      end
    end
  end
end
