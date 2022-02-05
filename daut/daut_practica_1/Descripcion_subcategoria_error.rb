class Descripcion_subcategoria_error < StandardError
  def initialize (descripcion) 
    @descripcion = descripcion 
  end 
  attr_reader :descripcion
end