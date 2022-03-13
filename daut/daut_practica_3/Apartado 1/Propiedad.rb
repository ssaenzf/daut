class Propiedad
  def initialize(nombre, tipo)
    @nombre = nombre
    @tipo = tipo
  end

  def esOpcional
    @opcional = true
  end

  attr_reader :nombre, :tipo
end
