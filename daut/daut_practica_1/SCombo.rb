require_relative 'Servicio'
class SCombo < Servicio
  def initialize(descripcion, *servicios)
    super(descripcion)
    @listServicios = servicios
  end

  attr_accessor :listServicios, :descripcion

  def to_s()
    puts super.to_s + "Servicios: \n"

    @listServicios.each do |s|
      puts s.to_s
    end
  end

end
