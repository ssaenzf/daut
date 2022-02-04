require_relative 'Socio'

socio1 = Socio.new('Pepito', '1234567a', 123456789)
puts "Socio 1:\n"
socio1.to_s
Socio.fecha_registro_socios = Time.new(Time.now.year, Time.now.month-1)
socio2 = Socio.new('Jose', '1234567b', 123456788)
puts "Socio 2:\n"
socio2.to_s

for i in 1..10000
  Socio.new('Jose', i.to_s, i)
end
