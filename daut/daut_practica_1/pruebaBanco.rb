require_relative 'Banco'
b = Banco.new
# Crear socios
socio1 = b.crearSocio('Pepito', '1234567a', 123456789)
socio2 = b.crearSocio('Jose', '1234567b', 123456788)
socio3 = b.crearSocio('Javier', '1234567c', 123456787)

b.mostrarSocios

# Crear categorías
categoria_fon = b.crearCategoria('FON', 'Fontaneria')
categoria_car = b.crearCategoria('CAR', 'Carpinteria')
categoria_cla = b.crearCategoria('CLA', 'Clases')
categoria_cla_i = b.crearCategoria('CLA.i', 'Ingles', categoria_cla)
categoria_cla_i1 = b.crearCategoria('CLA.i1', 'Basico', categoria_cla_i)
categoria_cla_y = b.crearCategoria('CLA.y', 'Yoga', categoria_cla)
categoria_cla_y1 = b.crearCategoria('CLA.y1', 'Basico', categoria_cla_y)
categoria_cla_y2 = b.crearCategoria('CLA.y2', 'Avanzado', categoria_cla_y)

# Comprobación errores
b.crearCategoria('FON', 'Fonometria')
b.crearCategoria('XXX', 'subcategoria_fon_incorrecta', categoria_fon)
b.crearCategoria('CLA.i2', 'Ingles', categoria_cla)

b.mostrarCategorias
puts "\n"
# Crear Servicios
sbasico = b.crearServicoBasico('Inglés', socio1, categoria_cla, 16, 18, 'Lunes', 'Miércoles')
sbasico2 = b.crearServicoBasico('Carpinteria', socio1,  categoria_car, 17, 18, 'Lunes')
sbasico3 = b.crearServicoBasico('Yoga', socio1,  categoria_cla_y, 18, 20, 'Martes')

scombo = b.crearServicoCombo('Combo1', socio1, sbasico3)
#Combo correcto
scombo2 = b.crearServicoCombo('Combo2', socio1, sbasico, scombo)
#Combo incorrecto
scombo3 = b.crearServicoCombo('Combo3', socio1, sbasico3, scombo2)

actGrupal = b.crearActGrupal('Yoga', socio1, categoria_cla_y, 15, 16, 17, 'Viernes', socio2, socio3)

#Error actividad grupal
scombo4 = b.crearServicoCombo('Combo4', socio1, sbasico, actGrupal, scombo)
scombo5 = b.crearServicoCombo('Combo5', socio1, sbasico2, scombo2)

b.mostrarServicios

# Crear Intercambios
b.crearIntercambio(socio2, sbasico)
b.crearIntercambio(socio2, scombo5)
b.crearIntercambio(socio1, actGrupal)

b.mostrarIntercambios

b.mostrarSaldos

# Estadísticas
b.mostrarEstadisticas