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

dataset.mostrarRegistros

# filtros de búsqueda
dataset.addFiltro("mayorEdad", "edad") { |edad| edad >= 18 }
dataset.addFiltro("tieneMascota", "mascota") { |mascota, tipo| mascota == tipo }
dataset.addFiltro("rangoEdad", "edad") { |edad, min, max| edad>=min and edad<=max }

dataset.mostrarFiltros

puts dataset.buscar_mayorEdad # devuelve reg1, reg2, reg3
puts dataset.buscar_tieneMascota("tortuga") # devuelve reg2
puts dataset.buscar_rangoEdad(20, 30) # devuelve reg1, reg3
puts dataset.buscar_rangoEdad_tieneMascota(20, 80, "tortuga") # devuelve reg2
dataset.buscar_tieneProfesion("escultor") # excepción: el filtro tieneProfesion no existe
dataset.delFiltro("rangoEdad")
dataset.buscar_rangoEdad(20, 30) # excepción: el filtro rangoEdad no existe

dataset.mostrarAccesos
