class Propiedad
  def initialize(nombre, tipo)
    @nombre = nombre
    @tipo = tipo
    @opcional = false
  end

  def esOpcional
    @opcional = true
  end

  def to_s
    puts "\tNombre: #{@nombre}. Tipo: #{@tipo}. Opcional: #{@opcional}"
  end

  attr_reader :nombre, :tipo, :opcional
end
