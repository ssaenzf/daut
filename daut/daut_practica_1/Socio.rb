# Errores a tener en cuenta -> 1. Numero de socios del mes superior a 9999, 2. Que ponga el contador a 1 al comenzar nuevo mes
require_relative 'Numero_socios_error'
def obtener_identificador()
  fecha_actual = Socio.fecha_registro_socios
  fecha_formato = sprintf("%04d_%02d", fecha_actual.year, fecha_actual.month)
  longitud = Socio.socios_mes_actual.to_s.length
  longitud = 4 - longitud
  if longitud < 0
    raise Numero_socios_error, "El numero de socios registrados para este mes supera los posibles para esta aplicacion"
  else
    identificador = fecha_formato
    identificador = identificador + '_'
    until longitud == 0
     identificador = identificador + '0'
     longitud -= 1
    end
    identificador = identificador + Socio.socios_mes_actual.to_s
  end
  return identificador
end

class Socio
  def initialize (nombre, nif, telefono)
    @saldo = 2
    @nombre = nombre
    @nif = nif
    @telefono = telefono
    if (!@@fecha_registro_socios) || (Time.now.year > @@fecha_registro_socios.year) || ((Time.now.year == @@fecha_registro_socios.year) and (Time.now.month > @@fecha_registro_socios.month))
      @@fecha_registro_socios = Time.new(Time.now.year, Time.now.month)
      @@socios_mes_actual = 1
    else
      @@socios_mes_actual = @@socios_mes_actual + 1
    end
    @identificador = obtener_identificador
  end
  
  @@socios_mes_actual = 1
  @@fecha_registro_socios = nil
  attr_accessor :socios_mes_actual, :saldo, :nombre, :nif, :telefono
  attr_reader :identificador
  
  def self.fecha_registro_socios
    @@fecha_registro_socios
  end
  def self.fecha_registro_socios=(fecha)
      @@fecha_registro_socios = fecha
  end
  
  def self.socios_mes_actual
    @@socios_mes_actual
  end
  def self.socios_mes_actual=(soicios)
        @@socios_mes_actual = socios
  end
  
  def to_s ()
    puts("Nombre: " + @nombre.to_s + "\nnif: " + @nif.to_s + "\nTelefono: " +  @telefono.to_s + "\nSaldo: " +  @saldo.to_s + "\nIdentificador: " +  @identificador.to_s)
  end
end

