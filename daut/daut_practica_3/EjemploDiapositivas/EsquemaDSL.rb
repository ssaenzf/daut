require_relative 'Esquema'
require_relative 'Columna'
require_relative 'Tabla'
require_relative 'Clave'

class EsquemaDSL
  def self.esquema(nombre)
    @esquema = Esquema.new(nombre)
    yield if block_given?
  end

  def self.tabla(nombre)
    t = Tabla.new(nombre)
    @esquema.add_tabla(t)
    yield if block_given?
  end

  def self.columna(nombre, tipo)
    tabla = @esquema.get_tabla( @esquema.num_tablas-1 )
    columna = Columna.new(nombre,tipo)
    tabla.add_columna(columna)
  end

  def self.clave(columna)
    tabla = @esquema.get_tabla(@esquema.num_tablas-1)
    # busca columna por nombre
    columna = tabla.find_columna(columna)
    clave = Clave.new(columna)
    tabla.add_clave(clave)
  end

  def self.get_esquema
    @esquema
  end

  def self.mostrar
    @esquema.to_s
  end
end
