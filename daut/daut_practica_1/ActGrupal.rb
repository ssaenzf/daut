require_relative 'Servicio'
class ActGrupal < Servicio
  def initialize(descripcion, socio, categoria, min_asistentes, horaIni, horaFin, dia, *colaboradores)
    super(descripcion, socio)
    @categoria = categoria
    @minimo = min_asistentes
    @horaIni = horaIni
    @horaFin = horaFin
    @dia = dia
    @colaboradores = colaboradores
  end

  attr_accessor :descripcion

  def to_s()
    nombres = Array.new
    @colaboradores.each do |x|
      nombres.append(x.nombre)
    end
    puts (super.to_s + "Categoria: " + @categoria.descripcion + "\nMin Participantes: " +
    @minimo.to_s + "\nDisponibilidad: \n" + "\tDía: " + @dia + "\n\tHora Inicio: " + @horaIni.to_s + "\n\tHora Fin: " +
     @horaFin.to_s + "\nColaboradores: " + nombres.to_s)
  end

end
