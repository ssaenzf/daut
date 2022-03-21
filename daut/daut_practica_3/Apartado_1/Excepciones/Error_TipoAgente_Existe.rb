class Error_TipoAgente_Existe < RuntimeError
  def initialize(tipoAgente)
    super
    @tipoAgente = tipoAgente
  end
  attr_reader :tipoAgente
end

