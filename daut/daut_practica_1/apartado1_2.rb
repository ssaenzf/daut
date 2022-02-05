require_relative 'Socio'
require_relative 'Categoria'
require_relative 'Codigo_categoria_error'
require_relative 'Codigo_subcategoria_error'
require_relative 'Descripcion_subcategoria_error'

# Apartado 1
socio1 = Socio.new('Pepito', '1234567a', 123456789)
puts "Socio 1:\n"
socio1.to_s
socio2 = Socio.new('Jose', '1234567b', 123456788)
puts "Socio 2:\n"
socio2.to_s

# Apartado 2
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