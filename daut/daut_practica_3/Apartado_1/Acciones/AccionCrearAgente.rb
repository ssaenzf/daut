require_relative '../Excepciones/Error_Agente_Propiedades'

class AccionCrearAgente
  def initialize(tipo)
    @tipo = tipo
    @propiedades = Hash.new
  end

  def addValorPropiedad(prop, valor)
    @propiedades[prop.to_s] = valor
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
            "Error al crear accionCrearAgente. La/s propiedad/es #{no_asignadas.to_s} obligatorias del agente no les han sido asignado un valor\n"
    end
    true
  end

  def to_s
    puts "\tCrearAgente. Tipo: #{@tipo.nombre}"
  end

  attr_reader :tipo, :propiedades
end
