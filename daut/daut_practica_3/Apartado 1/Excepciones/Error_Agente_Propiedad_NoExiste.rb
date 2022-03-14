class Error_Agente_Propiedad_NoExiste < RuntimeError
  def initialize(propiedad)
    super
    @propiedad = propiedad
  end
  attr_reader :propiedad
end

