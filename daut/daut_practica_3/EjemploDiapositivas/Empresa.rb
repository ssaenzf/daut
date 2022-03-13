require_relative 'EsquemaDSL'

class Empresa < EsquemaDSL
  esquema(:Empresa) {
    tabla :Empleado do
      columna :id_empleado, :NUMBER
      columna :nombre, :VARCHAR
      columna :direccion, :VARCHAR
      clave :id_empleado
    end
    tabla :Nomina do
      columna :salario, :NUMBER
    end
    tabla :Prueba
  }
end

e = Empresa.get_esquema
e.to_s
Empresa.mostrar