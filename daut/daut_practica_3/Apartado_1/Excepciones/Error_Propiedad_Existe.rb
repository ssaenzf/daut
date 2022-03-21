class Error_Propiedad_Existe < RuntimeError
  def initialize(propiedad)
    super
    @propiedad = propiedad
  end
  attr_reader :propiedad
end
