require 'matrix'
s = :perro
s1 = "perro"
i = 5

puts s.class
puts s1.class
puts i.instance_of?(Integer)

tamanio = 4

var = 0
=begin
while var < 5
  num_aleat = rand(tamanio)
  puts num_aleat
  var += 1
end
=end


a = Matrix.zero(tamanio)
a[3, 3] = 't'
puts a[0, 0]
puts a
puts a.to_a.map(&:inspect)

puts rand(2)

a = Array.new
a.length

puts a.class


# Crea un nuevo fichero, y escribe
#File.open('text.txt', 'w') do |f2|
  # '\n' es el retorno de carro
#f2.puts "Por que la vida \n puede ser maravillosa"
#end
