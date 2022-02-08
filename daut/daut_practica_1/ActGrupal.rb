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
    puts super.to_s
  end

end
