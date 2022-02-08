require_relative 'Servicio'
class SBasico < Servicio
  def initialize(descripcion, categoria, *disponiblidad)
    super(descripcion)
    @categoria = categoria
    @disponibilidad = disponiblidad
  end

  attr_accessor :categoria, :descripcion

  def to_s()
    puts super.to_s + "Categoria: " + @categoria.codigo + "\nDisponibilidad: " + @disponibilidad.to_s + "\n"

  end
end
