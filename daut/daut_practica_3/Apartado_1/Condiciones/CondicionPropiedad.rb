require_relative '../Excepciones/Error_Operacion'
class CondicionPropiedad
  def initialize(operacion, propiedad, valor)
    if operacion != :igual
      if !valor.instance_of?(Integer) && !valor.instance_of?(Float)
        raise Error_Operacion.new, "No se puede realizar la operación #{operacion} sobre #{valor}, ya que, es un #{valor.class}\n"
      end
    end
    @operacion = operacion
    @propiedad = propiedad.to_s
    @valor = valor
  end

  def to_s
    puts "\tOperación: #{@operacion}. Propiedad: #{@propiedad}. Valor: #{@valor}"
  end

  attr_reader :valor, :propiedad, :operacion
end
