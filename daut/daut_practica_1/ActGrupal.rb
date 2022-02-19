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

  attr_accessor :descripcion, :horaIni, :horaFin, :dia, :colaboradores, :minimo, :categoria

  def to_s()
    nombres = Array.new
    @colaboradores.each do |x|
      nombres.append(x.nombre)
    end
    puts (super.to_s + "Categoria: " + @categoria.descripcion + "\nMin Participantes: " +
    @minimo.to_s + "\nDisponibilidad: \n" + "\tDía: " + @dia + "\n\tHora Inicio: " + @horaIni.to_s + "\n\tHora Fin: " +
     @horaFin.to_s + "\nColaboradores: " + nombres.to_s)
  end
  def eql?(other)
    return (self.class == other.class && @descripcion == other.descripcion && @socio.nombre == other.socio.nombre)
  end

  def hash
    return [self.class, @descripcion, @socio.nombre].hash
  end
  
  def ==(other)
    return (other.class == self.class && other.descripcion == @descripcion && other.socio.nombre = @socio.nombre)
  end
end
