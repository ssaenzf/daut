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
y = Perro.new
z = clonado_superficial(y)
z.to_s

#### PRUEBA CLONADO PROFUNDO ####
autor = Autor.new
y = Libro.new(autor)
z = clonado_profundo(y)
z.to_s

#### PRUEBA CLONADO PEREZOSO #### -> Sin cambios, con cambios en el original posterior al clonado, con cambios en el clon y despues en el original
# ambos posterior al clonado
puts "Clonado perezoso caso basico, sin cambios \n"
autor = Autor.new
original = Libro.new(autor)
clon = clonado_perezoso(original)
clon.to_s

puts "Caso con cambios en el original posterior al clonado \n"
for method in original.class.instance_methods
  puts method
end
original.id=7
clon.to_s

