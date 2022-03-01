class Error_Filtro_Parametros < RuntimeError
  def initialize (nombre)
    super
    @filtro = nombre
  end
  attr_reader :filtro
end
