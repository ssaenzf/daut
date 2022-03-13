class TipoAgente
  def initialize(nombre)
    @nombre = nombre
    @propiedades = []
    @reglas = []
    #@@tiposAgentes = []
    #@@tiposAgentes << self
  end

  def addPropiedad(prop)
    @propiedades << prop
  end

  def addRegla(regla)
    @reglas << regla
  end

  def getRegla(pos)
    @reglas[pos]
  end

  def num_reglas
    @reglas.size
  end
end
