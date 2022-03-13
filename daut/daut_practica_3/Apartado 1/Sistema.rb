class Sistema
  def initialize
    @tiposAgentes = []
    @agentes = []
  end

  def addTipoAgente(tpAgente)
    @tiposAgentes << tpAgente
  end

  def num_tpAgentes
    @tiposAgentes.size
  end

  def getTpAgente(pos)
    @tiposAgentes[pos]
  end
end
