require_relative 'Sistema'
require_relative 'Propiedad'
require_relative 'TipoAgente'
require_relative 'Regla'
require_relative 'Agente'
require_relative 'Excepciones/Error_TipoAgente_NoExiste'
require_relative 'Excepciones/Error_TipoAgente_Existe'
require_relative 'Excepciones/Error_Propiedad_Existe'
require_relative 'Excepciones/Error_Propiedad_NoExiste'
require_relative 'Acciones/Error_Direccion'

class SistemaMultiAgenteDSL

  def self.sistema(nombre)
    @sistema = Sistema.new(nombre)
    yield if block_given?
  end

  def self.tipoAgente(nombre)
    begin
      @sistema.findTipoAgente(nombre)
      tpAgente = TipoAgente.new(nombre)
    rescue Error_TipoAgente_Existe => error
      print error
    else
      @sistema.addTipoAgente(tpAgente)
      yield if block_given?
    end
  end

  def self.propiedad(nombre, tipo)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    begin
      tpAgente.propiedadExists(nombre)
      propiedad = Propiedad.new(nombre, tipo)
    rescue Error_Propiedad_Existe => error
      print error
    else
      tpAgente.addPropiedad(propiedad)
      propiedad
    end
  end

  def self.regla(nombre)
    begin
      regla = Regla.new(nombre)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addRegla(regla)
      yield if block_given?
    rescue Error_Direccion => error
      print error
    end
  end

  def self.accion(nombre, *args)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    begin
      tpAgente.findPropiedad(args[0])
      regla = tpAgente.getRegla(tpAgente.num_reglas - 1)
      regla.addAccion(nombre, args)
    rescue Error_Propiedad_NoExiste => error
      print error
    end
  end

  def self.condicion(nombre, *args)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    begin
      if nombre != :crearAgente || nombre != :moverseA
        tpAgente.findPropiedad(args[0])
      else
        tpAgente
      end
      regla = tpAgente.getRegla(tpAgente.num_reglas - 1)
      regla.addCondicion(nombre, args)
    rescue Error_Propiedad_NoExiste => error
      print error
    end
  end

  def self.agente(nombre, tipo)
    begin
      tipoAgente = @sistema.getTipoAgente(tipo)
      a = Agente.new(nombre, tipoAgente)
      @sistema.addAgente(a)
      yield if block_given?
      a.allPropiedades
    rescue Error_TipoAgente_NoExiste => error
      print error
    rescue Error_Agente_Propiedades => error
      @sistema.removeAgente(a)
      print error
    end
  end

  def self.setPropiedadValor(propiedad, valor)
    agente = @sistema.getAgente(@sistema.num_agentes-1)
    begin
      agente.setPropiedadValor(propiedad, valor)
    rescue Error_Agente_Propiedad_NoExiste => error
      print error
    end
  end

  def self.getSistema
    @sistema
  end

  def mostrar
    @sistema.to_s
  end

end
