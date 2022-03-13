class Tabla
  def initialize(nombre)
    @nombre = nombre
    @columnas = []
    @claves = []
  end

  def add_columna(columna)
    @columnas << columna
  end

  def find_columna(columna)
    @columnas.find{ |col|
      col.nombre==columna }
  end

  def add_clave(clave)
    @claves << clave
  end

  def to_s
    puts "Nombre: #{@nombre}"
    @columnas.each(&:to_s).to_s
    @claves.each(&:to_s).to_s
  end

  attr_reader :columnas, :claves, :nombre
end
