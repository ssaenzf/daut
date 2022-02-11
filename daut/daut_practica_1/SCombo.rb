require_relative 'Servicio'
class SCombo < Servicio
  def initialize(descripcion, socio, *servicios)
    super(descripcion, socio)
    @listServicios = Array.new
    @listNombresServicios = Array.new
    setServicios(servicios)
  end

  attr_accessor :listServicios, :descripcion, :listNombresServicios

  def setServicios(servicios)
    servicios.each do |s|
      if s.instance_of? ActGrupal
        puts("No se pueden añadir actividades grupales a un combo\n")
      elsif s.instance_of?SCombo
        if (@listNombresServicios & s.listNombresServicios).size == 0
          @listServicios.append(s)
          @listNombresServicios = @listNombresServicios + s.listNombresServicios
        else
          puts "Servicios #{(@listNombresServicios & s.listNombresServicios)} repetidos. No se añade combo: #{s.descripcion}\n"
        end
      else
        if @listServicios.index(s.descripcion) != nil
          puts("Servicio #{s.descripcion} repetido\n")
        else
          @listNombresServicios.append(s.descripcion)
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
