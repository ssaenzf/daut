class Esquema
  def initialize(nombre)
    @nombre = nombre
    @tablas = []
  end
  def add_tabla (tabla)
    @tablas << tabla
  end
  def num_tablas ()
    @tablas.size
  end
  def get_tabla (posicion)
    @tablas[posicion]
  end
  def get_tablas
    @tablas
  end

  def to_s
    puts "Esquema: #{@nombre}"
    @tablas.each(&:to_s).to_s
  end
end
