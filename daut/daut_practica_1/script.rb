require_relative 'Socio'
require_relative 'Categoria'
require_relative 'Codigo_categoria_error'
require_relative 'Codigo_subcategoria_error'
require_relative 'Descripcion_subcategoria_error'
require_relative 'SBasico'
require_relative 'SCombo'
require_relative 'ActGrupal'

# Apartado 1
puts "****************** APARTADO 1 ******************\n"
socio1 = Socio.new('Pepito', '1234567a', 123456789)
puts "Socio 1:\n"
socio1.to_s
socio2 = Socio.new('Jose', '1234567b', 123456788)
puts "Socio 2:\n"
socio2.to_s
socio2 = Socio.new('Laura', '1234567c', 123456787)
puts "Socio 3:\n"
socio2.to_s

# Apartado 2
puts "****************** APARTADO 2 ******************\n"
# Salida normal
categoria_fon = Categoria.new('FON', 'Fontaneria')
categoria_fon.to_s

categoria_car = Categoria.new('CAR', 'Carpinteria')
categoria_car.to_s

categoria_cla = Categoria.new('CLA', 'Clases')
categoria_cla.to_s

categoria_cla_i = Categoria.new('CLA.i', 'Ingles', categoria_cla)
categoria_cla_i.to_s

categoria_cla_i1 = Categoria.new('CLA.i1', 'Basico', categoria_cla_i)
categoria_cla_i1.to_s

categoria_cla_y = Categoria.new('CLA.y', 'Yoga', categoria_cla)
categoria_cla_y.to_s

categoria_cla_y1 = Categoria.new('CLA.y1', 'Basico', categoria_cla_y)
categoria_cla_y1.to_s

categoria_cla_y2 = Categoria.new('CLA.y2', 'Avanzado', categoria_cla_y)
categoria_cla_y2.to_s

# Comprobacion de errores
begin
  categoria_fon_repetida = Categoria.new('FON', 'Fonometria')
rescue Codigo_categoria_error => error
  print error
end
begin
  subcategoria_fon_incorrecta = Categoria.new('XXX', 'subcategoria_fon_incorrecta', categoria_fon)
rescue Codigo_subcategoria_error => error
  print error
end
begin
  descripcion_subcategoria_repetida = Categoria.new('CLA.i2', 'Ingles', categoria_cla)
rescue Descripcion_subcategoria_error => error
  print error
end

#Apartado 3
puts "****************** APARTADO 3 ******************\n"
sbasico = SBasico.new('Inglés', socio1, categoria_cla, 16, 18, 'Lunes', 'Miércoles')
sbasico.to_s
puts "\n"
sbasico2 = SBasico.new('Carpinteria', socio1, categoria_car, 16, 18, 'Lunes')
sbasico2.to_s
puts "\n"
sbasico3 = SBasico.new('Yoga', socio1, categoria_cla_y, 18, 20, 'Martes')
sbasico3.to_s
puts "\n"
scombo = SCombo.new('Combo1', socio1, sbasico3)
scombo.to_s
#Combo incorrecto
scombo2 = SCombo.new('Combo2', socio1, sbasico, scombo)
scombo2.to_s
#Combo correcto compuesto
scombo3 = SCombo.new('Combo3', socio1, sbasico3, scombo2)
scombo3.to_s

actGrupal = ActGrupal.new('Yoga', socio1, categoria_cla_y, 15, 15, 17, 'Viernes', socio1, socio2)
actGrupal.to_s
puts("\n")
#Error actividad grupal
scombo4 = SCombo.new('Combo4', socio1, sbasico, actGrupal, scombo)
scombo4.to_s