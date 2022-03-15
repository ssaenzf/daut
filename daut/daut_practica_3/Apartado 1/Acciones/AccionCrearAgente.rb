class AccionCrearAgente
  def initialize(nombre, tipo, *propiedades)
    @nombre = nombre
    @tipo = tipo
  end

  def to_s
    puts "\tNombre: #{@nombre}. Tipo: #{@tipo}"
  end
end
