class Columna
  def initialize (nombre, tipo)
    @nombre = nombre
    @tipo = tipo
  end

  def to_s
    puts "#{@nombre} -> #{@tipo}"
  end
  attr_reader :nombre
end
