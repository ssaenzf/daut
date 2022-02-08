require_relative 'Servicio'
class ActGrupal < Servicio
  def initialize(descripcion, categoria, fecha, min_asistentes, *colaboradores)
    super(descripcion)
    @categoria = categoria
    @fecha = fecha
    @minimo = min_asistentes
    @colaboradores = colaboradores
  end

  attr_accessor :descripcion

  def to_s()
    nombres = Array.new
    @colaboradores.each do |x|
      nombres.append(x.nombre)
    end
    puts (super.to_s + "Categoria: " + @categoria.descripcion + "\nFecha: " + @fecha + "\nMin Participantes: " +
    @minimo.to_s + "\nColaboradores: " + nombres.to_s)
  end

end
