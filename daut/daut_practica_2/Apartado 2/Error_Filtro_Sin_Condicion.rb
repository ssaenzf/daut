class Error_Filtro_Sin_Condicion < RuntimeError
  def initialize(filtro)
    super
    @filtro = filtro
  end
  attr_reader :filtro
end
