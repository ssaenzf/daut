require_relative 'Socio'
require_relative 'Categoria'
require_relative 'Codigo_categoria_error'
require_relative 'Codigo_subcategoria_error'
require_relative 'Descripcion_subcategoria_error'
require_relative 'SBasico'
require_relative 'SCombo'
require_relative 'ActGrupal'

# Apartado 1
socio1 = Socio.new('Pepito', '1234567a', 123456789)
puts "Socio 1:\n"
socio1.to_s

# Apartado 2
# Salida normal
categoria_fon = Categoria.new('FON', 'Fontaneria')
categoria_fon.to_s

categoria_car = Categoria.new('CAR', 'Carpinteria')
categoria_car.to_s

categoria_cla = Categoria.new('CLA', 'Clases')
categoria_cla.to_s

#Apartado 3
sbasico = SBasico.new('Inglés', categoria_cla, "lunes","miercoles", 16,18)
sbasico.to_s

sbasico2 = SBasico.new('Carpinteria', categoria_car, "lunes", 16,18)
sbasico2.to_s

scombo = SCombo.new('Combo1', sbasico,sbasico2)
scombo.to_s

scombo2 = SCombo.new('Combo2', sbasico,sbasico2, scombo)
scombo2.to_s