$stdout.sync = true
require_relative 'Banco'
require_relative 'Buscador_servicios'

b = Banco.new

# Crear socios
socio1 = b.crearSocio('Pepito', '1234567a', 123456789)
socio2 = b.crearSocio('Jose', '1234567b', 123456788)
socio3 = b.crearSocio('Javier', '1234567c', 123456787)
socio4 = b.crearSocio('Luis', '1234567d', 123456786)
b.mostrarSocios

# Crear categorias
categoria_fon = b.crearCategoria('FON', 'Fontaneria')
categoria_car = b.crearCategoria('CAR', 'Carpinteria')
categoria_cla = b.crearCategoria('CLA', 'Clases')
categoria_cla_i = b.crearCategoria('CLA.i', 'Ingles', categoria_cla)
categoria_cla_i1 = b.crearCategoria('CLA.i1', 'Basico', categoria_cla_i)
categoria_cla_y = b.crearCategoria('CLA.y', 'Yoga', categoria_cla)
categoria_cla_y1 = b.crearCategoria('CLA.y1', 'Basico', categoria_cla_y)
categoria_cla_y2 = b.crearCategoria('CLA.y2', 'Avanzado', categoria_cla_y)

# Comprobacion errores categorias
b.crearCategoria('FON', 'Fonometria')
b.crearCategoria('XXX', 'subcategoria_fon_incorrecta', categoria_fon)
b.crearCategoria('CLA.i2', 'Ingles', categoria_cla)
puts "\n"
b.mostrarCategorias
puts "\n"

# Crear Servicios
sbasico1 = b.crearServicoBasico('Ingles', socio1, categoria_cla_i, 16, 18, 'Lunes', 'Miercoles')
sbasico2 = b.crearServicoBasico('Carpinteria', socio2,  categoria_car, 17, 18, 'Lunes')
sbasico3 = b.crearServicoBasico('Yoga', socio3,  categoria_cla_y, 19, 20, 'Martes')

scombo1 = b.crearServicoCombo('Combo1', socio1, sbasico3)
scombo2 = b.crearServicoCombo('Combo2', socio2, sbasico1, scombo1)
# Combo incorrecto, servicio repetido
scombo3 = b.crearServicoCombo('Combo3', socio1, sbasico3, scombo2)

actGrupal = b.crearActGrupal('Clase Yoga', socio2, categoria_cla_y, 15, 16, 17, 'Viernes', socio1, socio3)
# Combo incorrecto, actividad grupal
scombo4 = b.crearServicoCombo('Combo4', socio1, sbasico1, actGrupal, scombo1)

scombo5 = b.crearServicoCombo('Combo5', socio1, sbasico2, scombo2)
b.mostrarServicios

# Crear Intercambios
b.crearIntercambio(socio2, sbasico1)
b.crearIntercambio(socio1, sbasico3)
b.crearIntercambio(socio3, scombo5)
b.crearIntercambio(socio4, actGrupal)
b.crearIntercambio(socio4, sbasico3)

b.mostrarIntercambios

b.mostrarSaldos

# Estadisticas
b.mostrarEstadisticas
puts "\n"

# Buscador de servicios -> Manejar error de que no introduzca ningún criterio
puts "Criterio 1. Introduce el identificador del socio ofertante, si desea por el contrario pasar al siguiente criterio de busqueda, pulse enter"
identificador = gets
puts "Criterio 2. Introduce el codigo de la categoria, si desea por el contrario pasar al siguiente criterio de busqueda, pulse enter"
codigo = gets
# El formato debe ser lunes,martes,miercoles de 10 a 14
puts "Criterio 3. Introduce el horario de la actividad"
horario = gets
listServicios = b.listServicios

buscador_servicios = Buscador_servicios.new(identificador, codigo, horario, listServicios)
puts buscador_servicios.busqueda()
#buscador_servicios.numero_intercambios()
#buscador_servicios.saldo()


