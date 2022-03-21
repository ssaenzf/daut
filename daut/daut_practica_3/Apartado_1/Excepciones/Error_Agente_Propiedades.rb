class Error_Agente_Propiedades < RuntimeError
  def initialize(agente)
    super
    @agente = agente
  end
  attr_reader :agente
end
