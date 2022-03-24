require_relative 'Propiedad'
require_relative 'Excepciones/Error_Propiedad_Existe'
require_relative 'Excepciones/Error_TipoDato'
require_relative 'Excepciones/Error_Regla_Existe'

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
    encontrado
  end

  def comprobarTipoDato(propiedad, valor)
    @propiedades.each do |p|
      next unless p.nombre == propiedad

      t = p.tipo
      if t == :VARCHAR
        if !valor.instance_of?(String) && !valor.instance_of?(Symbol)
          raise Error_TipoDato.new, "El valor #{valor} no es correcto para la propiedad #{propiedad}, requiere un #{t}\n"
        end
      else
        if !valor.instance_of?(Integer) && !valor.instance_of?(Float)
          raise Error_TipoDato.new, "El valor #{valor} no es correcto para la propiedad #{propiedad}, requiere un #{t}\n"
        end
      end
    end
  end

  def addAccion(accion)
    regla = getRegla(num_reglas - 1)
    regla.addAccion(accion)
  end

  def addCondicion(cond)
    regla = getRegla(num_reglas - 1)
    regla.addCondicion(cond)
  end

  def comprobarPropiedades(propiedad, valor)
    if findPropiedad(propiedad)
      comprobarTipoDato(propiedad, valor)
    end
  end

  def addRegla(regla)
    @reglas << regla
  end

  def reglaExiste(nombre)
    @reglas.each do |r|
      if r.nombre == nombre
        raise Error_Regla_Existe.new, "Error, la regla #{nombre} ya existe\n"
      end
    end
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

  def removeRegla(regla)
    @reglas.delete(regla)
  end

  def to_s
    puts "Tipo Agente: #{@nombre}"
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
