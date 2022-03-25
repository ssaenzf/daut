require_relative 'Propiedad'
require_relative 'TipoAgente'
require_relative 'Excepciones/Error_Agente_Propiedad_NoExiste'
require_relative 'Excepciones/Error_Agente_Propiedades'

class Agente
  def initialize(nombre, tipoAgente)
    @_x = 0
    @_y = 0
    @nombre = nombre.to_s
    @listProp = tipoAgente.propiedades
    @tipoAgente = tipoAgente
    @propiedades = Hash.new
    setPropiedades(tipoAgente)
    @reglas = tipoAgente.getReglas
  end

  def setPropiedades(tipoAgente)
    tipoAgente.propiedades.each do |p|
      @propiedades[p.nombre] = nil
    end
  end

  def setPropiedadValor(propiedad, valor)
    if @propiedades.key? propiedad.to_s
      @tipoAgente.comprobarPropiedades(propiedad, valor)
      @propiedades[propiedad.to_s] = valor
    else
      raise Error_Agente_Propiedad_NoExiste.new(propiedad),
            "No existe la propiedad #{propiedad} en el agente #{@nombre}. No se puede asignar el valor: #{valor}\n"
    end
  end

  def allPropiedades
    propiedades = []
    @listProp.each do |p|
      if @propiedades[p.nombre].nil? && !p.opcional
        propiedades << p.nombre
      end
    end
    unless propiedades.empty?
      raise Error_Agente_Propiedades.new(@nombre),
            "La/s propiedad/es #{propiedades} obligatorias del agente #{@nombre} no les han sido asignado un valor\n"
    end
    true
  end

  def getValor(propiedad)
    @propiedades[propiedad]
  end

  def setCoordenadas(x, y)
    @_x = x
    @_y = y
  end

  def to_s
    puts "Agente: #{@nombre}"
    puts "Propiedades: #{@propiedades.to_s}"
  end

  attr_reader :nombre, :tipoAgente, :reglas, :propiedades, :_x, :_y
end
