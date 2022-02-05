class Codigo_subcategoria_error < StandardError
  def initialize (subcategoria_codigo, padre_codigo) 
    @subcategoria_codigo = subcategoria_codigo
    @padre_codigo = padre_codigo 
  end 
  attr_reader :subcategoria_codigo, :padre_codigo
end