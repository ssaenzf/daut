class CondicionAgenteA
  def initialize(nombre, tipo, distancia)
    @nombre = nombre
    @tipo = tipo
    @distancia = distancia
  end

  def to_s
    puts "\tNombre: #{@nombre}. Tipo: #{@tipo}. Distancia: #{@distancia}"
  end
end
