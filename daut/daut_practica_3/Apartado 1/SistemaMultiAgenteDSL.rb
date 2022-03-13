require_relative 'Sistema'
require_relative 'Propiedad'
require_relative 'TipoAgente'
require_relative 'Regla'

class SistemaMultiAgenteDSL

  def self.sistema
    @sistema = Sistema.new
    yield if block_given?
  end

  def self.tipoAgente(nombre)
    tpAgente = TipoAgente.new(nombre)
    @sistema.addTipoAgente(tpAgente)
    yield if block_given?
  end

  def self.propiedad(nombre, tipo)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    propiedad = Propiedad.new(nombre, tipo)
    tpAgente.addPropiedad(propiedad)
    propiedad
  end

  def self.regla(nombre)
    regla = Regla.new(nombre)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    tpAgente.addRegla(regla)
    yield if block_given?
  end

  def self.accion(nombre, *args)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    regla = tpAgente.getRegla(tpAgente.num_reglas - 1)
    regla.addAccion(nombre, args)
  end

  def self.condicion(nombre, *args)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    regla = tpAgente.getRegla(tpAgente.num_reglas - 1)
    regla.addCondicion(nombre, args)
  end

  def self.getSistema
    @sistema
  end

end
