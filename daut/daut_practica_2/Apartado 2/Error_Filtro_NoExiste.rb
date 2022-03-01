class Error_Filtro_NoExiste < RuntimeError
  def initialize (filtro)
    @filtro = filtro
  end
  attr_reader :filtro
end
