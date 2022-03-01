class Filtro
  def initialize(nombre, campo, bloque)
    @nombre = nombre
    @campo = campo
    @condicion = bloque
  end

  def applyFiltro(campos)
    @condicion.call(campos)
  end

  def to_s
    @nombre + " " + @campo + " " + @condicion.to_s
  end

  attr_reader :nombre, :campo, :condicion
end
