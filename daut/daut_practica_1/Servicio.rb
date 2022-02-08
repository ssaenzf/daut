class Servicio
  def initialize(descripcion)
    @descripcion = descripcion
  end

  attr_accessor :descripcion

  def to_s()
    puts("Descripción: " + @descripcion + "\n")
  end
end
