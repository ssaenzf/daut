class Error_Saldo_Intercambio < RuntimeError
  def initialize (socio, servicio)
    @socio = socio
    @servicio = servicio
  end
  attr_reader :socio, :servicio
end
