class Perro
  def initialize
    @id = 0
    @tipo = "ij"
  end

  def to_s
    puts "Id: #{@id}. Tipo: #{@tipo}"
  end
  
  attr_accessor :id
end