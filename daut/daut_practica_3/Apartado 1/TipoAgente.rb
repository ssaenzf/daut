require_relative 'Propiedad'
require_relative 'Excepciones/Error_Propiedad_Existe'

class TipoAgente
  def initialize(nombre)
    @nombre = nombre
    @propiedades = []
    @reglas = []
  end

  def addPropiedad(prop)
    @propiedades << prop
  end

  def propiedadExists(nombre)
    @propiedades.each do |p|
      if p.nombre == nombre
        raise Error_Propiedad_Existe.new(nombre), "La propiedad #{nombre} ya existe para el tipo agente #{@nombre}\n"
      end
    end
    false
  end
  
  def findPropiedad(nombre)
    encontrado = false
    @propiedades.each do |p|
      if p.nombre == nombre
        encontrado = true
      end
    end
    unless encontrado
      raise Error_Propiedad_NoExiste.new(nombre), 
            "La propiedad #{nombre} no existe para el tipo agente #{@nombre}\n"
    end
  end

  def addRegla(regla)
    @reglas << regla
  end

  def getRegla(pos)
    @reglas[pos]
  end

  def getReglas
    @reglas
  end

  def num_reglas
    @reglas.size
  end

  def to_s
    puts "Tipos Agente: #{@nombre}"
    puts "Propiedades: \n"
    (@propiedades.each do |p|
      p.to_s
    end).to_s

    puts "Reglas: \n"
    (@reglas.each do |r|
      r.to_s
    end).to_s
  end

  attr_reader :nombre, :propiedades, :reglas
end
