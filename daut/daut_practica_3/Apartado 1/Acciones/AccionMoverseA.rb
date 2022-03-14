require_relative 'Error_Direccion'

class AccionMoverseA
  def initialize(nombre, direccion, unidades)
    @nombre = nombre
    @desplazamiento = unidades
    direcciones = %i[norte sur este oeste aleatroria]
    if !direcciones.index(direccion)
      raise Error_Direccion.new(),
            "Direccion #{direccion} incorrecta.\nLas opciones correctas son #{direcciones.to_s}\n"
    end
    @direccion = direccion
  end

  def to_s
    puts "\tNombre: #{@nombre}. Direccion: #{@direccion}. Desplazamiento: #{@desplazamiento}"
  end
end
