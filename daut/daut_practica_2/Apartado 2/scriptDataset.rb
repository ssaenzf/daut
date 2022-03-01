require_relative 'Dataset'
require_relative 'Registro'

dataset = Dataset.new
# registros
reg1 = Registro.new
reg1.addCampo("edad", 25)
reg1.addCampo("profesion", "cantante")
reg2 = Registro.new
reg2.addCampo("edad", 55)
reg2.addCampo("profesion", "escritor")
reg2.addCampo("mascota", "tortuga")
reg3 = Registro.new
reg3.addCampo("edad", 28)
reg3.addCampo("profesion", "futbolista")

dataset.addRegistro(reg1)
dataset.addRegistro(reg2)
dataset.addRegistro(reg3)

puts "************ REGISTROS ************"
dataset.mostrarRegistros

# filtros de búsqueda
dataset.addFiltro("mayorEdad", "edad") { |edad| edad >= 18 }
dataset.addFiltro("tieneMascota", "mascota") { |mascota, tipo| mascota == tipo }
dataset.addFiltro("rangoEdad", "edad") { |edad, min, max| edad>=min and edad<=max }

puts "\n************ FILTROS ************"
dataset.mostrarFiltros

puts "\n************ BÚSQUEDAS ************"
puts dataset.buscar_mayorEdad # devuelve reg1, reg2, reg3
puts dataset.buscar_tieneMascota("tortuga") # devuelve reg2
puts dataset.buscar_rangoEdad(20, 30) # devuelve reg1, reg3
puts dataset.buscar_rangoEdad_tieneMascota(20, 80, "tortuga") # devuelve reg2

puts "\n************ CREACIÓN MÉTODOS DINÁMICOS ************"
# Prueba de creación métodos dinámicos
i = 0
until i > 8
  dataset.buscar_rangoEdad(20, 30)
  dataset.buscar_rangoEdad_tieneMascota(20, 80, "tortuga")
  i += 1
end

puts "\n************ LLAMADA MÉTODOS DINÁMICOS ************"
# Llamada al método dinámico creado
puts dataset.buscar_rangoEdad(20, 30)
puts dataset.buscar_rangoEdad_tieneMascota(20, 80, "tortuga")

puts "\n************ ACCESOS BÚSQUEDAS ************"
dataset.mostrarAccesos

puts "\n************ COMPROBACIÓN ERRORES ************"
# Errores
dataset.buscar_rangoEdad_tieneMascota(20, 80) # excepción: Número incorrecto de parámetros para el filtro tieneMascota
dataset.buscar_rangoEdad(20) # excepción: Número incorrecto de parámetros para el filtro rangoEdad (Un mensaje por cada registro)
dataset.buscar_tieneProfesion("escultor") # excepción: el filtro tieneProfesion no existe

puts "\n************ COMPROBACIÓN ELIMINACIÓN FILTRO ************"
dataset.delFiltro("rangoEdad") # Se eliminarán también los métodos dinámicos
dataset.buscar_rangoEdad(20, 30) # excepción: el filtro rangoEdad no existe

puts "\n************ ACCESOS BÚSQUEDAS ************"
dataset.mostrarAccesos