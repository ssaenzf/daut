require_relative 'Error_Filtro_Parametros'
class Filtro
  def initialize(nombre, campo, bloque)
    @nombre = nombre
    @campo = campo
    @condicion = bloque
  end

  def applyFiltro(campos)
    if campos.length != @condicion.arity
      raise Error_Filtro_Parametros.new(@nombre), "Número incorrecto de parámetros para el filtro #{@nombre}\n"
    end

    if @condicion.arity == 1
      @condicion.call(campos[0])
    else
      @condicion.call(campos)
    end
  end

  def to_s
    @nombre + " " + @campo + " " + @condicion.to_s
  end

  attr_reader :nombre, :campo, :condicion
end
