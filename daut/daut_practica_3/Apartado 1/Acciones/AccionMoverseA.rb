require_relative '../Excepciones/Error_Distancias'
class AccionMoverseA
  def initialize(direccion, unidades)
    if unidades.instance_of?(Integer)
      @desplazamiento = unidades
    else
      raise Error_Distancias.new, "El valor #{unidades} no es correcto para indicar unidades de desplazamiento\n"
    end
    @direccion = direccion
  end

  def to_s
    puts "\tDireccion: #{@direccion}. Desplazamiento: #{@desplazamiento}"
  end
end
