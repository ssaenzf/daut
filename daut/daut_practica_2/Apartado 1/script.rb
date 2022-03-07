# Archivos prueba clonado superficial
require_relative 'clonado_superficial'
require_relative 'perro'

# Archivos prueba clonado profundo
require_relative 'clonado_profundo'
require_relative 'Autor'
require_relative 'Libro'

# Archivos prueba clonado perezoso
require_relative 'clonado_perezoso'

#### PRUEBA CLONADO SUPERFICIAL ####
puts "Prueba clonado superficial: \n"
y = Perro.new
z = clonado_superficial(y, false)
z.to_s

#### PRUEBA CLONADO PROFUNDO ####
puts "\nPrueba clonado profundo: \n"
autor = Autor.new
y = Libro.new(autor)
z = clonado_profundo(y, false)
puts "Original \n"
y.to_s
puts "Clon \n"
z.to_s  # El objeto autor y autor 2 deben ser el mismo clon ya que referencian al mismo objeto, y el resto de variables, inlcuidos arrays y hash deben ser igual al original

#### PRUEBA CLONADO PEREZOSO #### -> Sin cambios, con cambios en el original posterior al clonado, con cambios en el clon y despues en el original
# ambos posterior al clonado
puts "\nClonado perezoso caso basico, sin cambios: \n"
autor = Autor.new
original = Libro.new(autor)
clon = clonado_perezoso(original, false)
clon.to_s # Debe tener el mismo id que el original, 5

puts "\nCaso con cambios en el original posterior al clonado \n"
autor = Autor.new
original = Libro.new(autor)
clon = clonado_perezoso(original, false)
original.id = 7
clon.to_s # Debe tener id 7

puts "\nCaso con cambios en el clon y despues en el original \n"
autor = Autor.new
original = Libro.new(autor)
clon = clonado_perezoso(original, false)
clon.id = 8
original.id = 9
clon.to_s # Debe tener id 8

puts "\nCaso con mas de un cambio en el original para una misma variable \n"
autor = Autor.new
original = Libro.new(autor)
clon = clonado_perezoso(original, false)
original.id = 8
original.id = 9
clon.to_s # Debe tener id 8

