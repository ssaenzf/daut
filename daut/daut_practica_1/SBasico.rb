require_relative 'Servicio'
class SBasico < Servicio
  def initialize(descripcion, categoria, disponiblidad)
    super(descripcion)
    @categoria = categoria
    @disponibilidad = disponiblidad
  end

  attr_accessor :categoria, :descripcion

  def to_s()
    puts super.to_s + "Categoria: " + @categoria.descripcion + "\nDisponibilidad: " + @disponibilidad

  end
end
