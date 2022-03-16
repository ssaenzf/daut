require_relative '../Excepciones/Error_Agente_Propiedades'

class AccionCrearAgente
  def initialize(nombre, tipo)
    @nombre = nombre
    @tipo = tipo
    @propiedades = Hash.new
  end

  def addValorPropiedad(prop, valor)
    @propiedades[prop] = valor
  end

  def allPropiedades
    prop = []
    estado = true
    @tipo.propiedades.each do |p| # Add obligatorias
      prop << p.nombre unless p.opcional
    end

    no_asignadas = []
    prop.each do |p|
      if !@propiedades.key?(p)
        estado = false
        no_asignadas.append(p)
      end
    end

    unless estado
      raise Error_Agente_Propiedades.new(@tipo),
            "La/s propiedad/es #{no_asignadas.to_s} obligatorias del agente #{@nombre} no les han sido asignado un valor\n"
    end
    true
  end

  def to_s
    puts "\tCrearAgente. Nombre: #{@nombre}. Tipo: #{@tipo.nombre}"
  end

  attr_reader :tipo, :propiedades
end
