require_relative 'Servicio'
class SBasico < Servicio
  def initialize(descripcion, socio, categoria, horaIni, horaFin, *dias)
    super(descripcion, socio)
    @categoria = categoria
    @horaIni = horaIni
    @horaFin = horaFin
    @dias = dias
  end

  attr_accessor :categoria, :descripcion, :horaIni, :horaFin, :dias

  def to_s()
    puts super.to_s + "Categoria: " + @categoria.descripcion + "\nDisponibilidad: \n" +
           "\tDía/s: " + @dias.to_s + "\n\tHora Inicio: " + @horaIni.to_s + "\n\tHora Fin: " + @horaFin.to_s
  end
  def eql?(other)
    return (self.class == other.class && @descripcion == other.descripcion && @socio.nombre == other.socio.nombre)
  end

  def hash
    return [self.class, @descripcion, @socio.nombre].hash
  end
  
  def ==(other)
    return (other.class == self.class && other.descripcion == @descripcion  && other.socio.nombre = @socio.nombre)
  end
end
