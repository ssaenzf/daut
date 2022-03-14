class AccionSumarValor
  def initialize(nombre, propiedad, valor)
    @nombre = nombre
    @propiedad = propiedad
    @valor = valor
  end

  def to_s
    puts "\tNombre: #{@nombre}. Propiedad: #{@propiedad}. Valor: #{@valor}"
  end
end
