class Error_Filtro_NoExiste < RuntimeError
  def initialize(filtro)
    super
    @filtro = filtro
  end
  attr_reader :filtro
end
