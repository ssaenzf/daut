class Clave
  def initialize (columna)
    @columna = columna
  end

  def to_s
    puts "-> #{@columna.nombre}"
  end
end
