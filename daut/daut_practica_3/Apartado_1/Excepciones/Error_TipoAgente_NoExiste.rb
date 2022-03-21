class Error_TipoAgente_NoExiste < RuntimeError
  def initialize(tipoAgente)
    super
    @tipoAgente = tipoAgente
  end
  attr_reader :tipoAgente
end
