class Error_Filtro_Existe < RuntimeError
  def initialize(filtro)
    super
    @filtro = filtro
  end
  attr_reader :filtro
end

