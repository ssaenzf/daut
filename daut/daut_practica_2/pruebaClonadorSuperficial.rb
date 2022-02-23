class Libro
  def initialize
    @id = 0
    @tipo = "ij"
  end

  def to_s
    puts "Id: #{@id}. Tipo: #{@tipo}"
  end
  
  attr_accessor :id
end

def clonar_superficial (obj)

  clon = obj.class.allocate

  for i in obj.instance_variables
    x = obj.instance_variable_get(i)
    clon.instance_variable_set(i, x)
  end

  clon
end

y = Libro.new
z = clonar_superficial(y)
z.to_s