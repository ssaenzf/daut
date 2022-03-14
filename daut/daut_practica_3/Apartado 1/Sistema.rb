require_relative 'TipoAgente'
require_relative 'Excepciones/Error_TipoAgente_NoExiste'
require_relative 'Excepciones/Error_TipoAgente_Existe'
require_relative 'Excepciones/Error_Agente_Propiedades'

class Sistema
  def initialize(nombre)
    @nombre = nombre
    @tiposAgentes = []
    @agentes = []
  end

  def addTipoAgente(tpAgente)
    @tiposAgentes << tpAgente
  end

  def addAgente(agente)
    @agentes << agente
  end

  def removeAgente(agente)
    @agentes.delete(agente)
  end

  def getTipoAgente(tipo)
    @tiposAgentes.each do |t|
      if t.nombre == tipo
        return t
      end
    end
    raise Error_TipoAgente_NoExiste.new(tipo), "El tipo agente #{tipo} no existe\n"
  end

  def findTipoAgente(nombre)
    @tiposAgentes.each do |t|
      if t.nombre == nombre
        raise Error_TipoAgente_Existe.new(nombre), "El tipo agente #{nombre} ya existe\n"
      end
    end
    false
  end

  def num_tpAgentes
    @tiposAgentes.size
  end

  def num_agentes
    @agentes.size
  end

  def getTpAgente(pos)
    @tiposAgentes[pos]
  end

  def getAgente(pos)
    @agentes[pos]
  end

  def to_s
    puts "Sistema: #{@nombre}"
    (@tiposAgentes.each do |t|
      t.to_s
    end).to_s
    (@agentes.each do |a|
      a.to_s
    end).to_s
  end
end
