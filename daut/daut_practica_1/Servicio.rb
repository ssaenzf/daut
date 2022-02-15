class Servicio
  def initialize(descripcion, socio)
    @descripcion = descripcion
    @socio = socio
  end

  attr_accessor :descripcion, :socio

  def to_s()
    puts("******* Servicio #{@descripcion} *******")
    puts("Socio: " + @socio.nombre + "\n")
  end
end
