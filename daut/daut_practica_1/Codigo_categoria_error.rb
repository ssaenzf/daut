class Codigo_categoria_error < StandardError
  def initialize (codigo) 
    @codigo = codigo 
  end 
  attr_reader :codigo
end