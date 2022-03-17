require_relative '../Excepciones/Error_Operacion'

class AccionModificarValor
  def initialize(operacion, propiedad, valor)
    if operacion != :asignar
      if !valor.instance_of?(Integer) && !valor.instance_of?(Float)
        raise Error_Operacion.new, "No se puede realizar la operación #{operacion} sobre #{valor}, ya que, es un #{valor.class}\n"
      end
    end
    @propiedad = propiedad
    @valor = valor
    @operacion = operacion
  end

  def to_s
    puts "\tOperacion: #{@operacion}. Propiedad: #{@propiedad}. Valor: #{@valor}"
  end

  attr_reader :valor, :operacion, :propiedad
end
