require_relative 'Sistema'
require_relative 'Propiedad'
require_relative 'TipoAgente'
require_relative 'Regla'
require_relative 'Agente'
require_relative 'Excepciones/Error_TipoAgente_NoExiste'
require_relative 'Excepciones/Error_TipoAgente_Existe'
require_relative 'Excepciones/Error_Propiedad_Existe'
require_relative 'Excepciones/Error_Propiedad_NoExiste'
require_relative 'Excepciones/Error_Distancias'
require_relative 'Excepciones/Error_TipoDato'
require_relative 'Excepciones/Error_Operacion'
require_relative 'Acciones/AccionModificarValor'
require_relative 'Acciones/AccionMoverseA'
require_relative 'Acciones/AccionCrearAgente'
require_relative 'Condiciones/CondicionAgenteA'
require_relative 'Condiciones/CondicionPropiedad'

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
    regla = Regla.new(nombre)
    tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
    tpAgente.addRegla(regla)
    yield if block_given?
  end

  def self.accionMoverseNorte(unidades)
    begin
      acc = AccionMoverseA.new(:norte, unidades)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
    rescue Error_Distancias => error
      print error
    end
  end

  def self.accionMoverseSur(unidades)
    begin
      acc = AccionMoverseA.new(:sur, unidades)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
    rescue Error_Distancias => error
      print error
    end
  end

  def self.accionMoverseEste(unidades)
    begin
      acc = AccionMoverseA.new(:este, unidades)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
    rescue Error_Distancias => error
      print error
    end
  end

  def self.accionMoverseOeste(unidades)
    begin
      acc = AccionMoverseA.new(:oeste, unidades)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
    rescue Error_Distancias => error
      print error
    end
  end

  def self.accionMoverseAleatorio(unidades)
    begin
      acc = AccionMoverseA.new(:aleatorio, unidades)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
    rescue Error_Distancias => error
      print error
    end
  end

  def self.accionAsignarValor(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      acc = AccionModificarValor.new(:asignar, propiedad, valor)
      tpAgente.addAccion(acc)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    end
  end

  def self.accionSumarValor(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      acc = AccionModificarValor.new(:sumar, propiedad, valor)
      tpAgente.addAccion(acc)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    rescue Error_Operacion => error
      print error
    end
  end

  def self.accionRestarValor(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      acc = AccionModificarValor.new(:restar, propiedad, valor)
      tpAgente.addAccion(acc)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    rescue Error_Operacion => error
      print error
    end
  end

  def self.accionCrearAgente(nombre, tipo)
    begin
      tipoAgente = @sistema.getTipoAgente(tipo)
      acc = AccionCrearAgente.new(nombre, tipoAgente)
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.addAccion(acc)
      yield if block_given?
      acc.allPropiedades
    rescue Error_TipoAgente_NoExiste => error
      print error
    rescue Error_Agente_Propiedades => error
      r = tpAgente.getRegla(tpAgente.num_reglas - 1)
      r.removeAccion(acc)
      print error
    end
  end

  def self.addValorPropiedad(prop, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      r = tpAgente.getRegla(tpAgente.num_reglas - 1)
      acc = r.getAccion(r.num_acciones - 1)
      tpA = acc.tipo
      tpA.findPropiedad(prop)
      tpA.comprobarTipoDato(prop, valor)
      acc.addValorPropiedad(prop, valor)
    rescue Error_Propiedad_NoExiste => error
      r.removeAccion(acc)
      print error
    rescue Error_TipoDato => error
      r.removeAccion(acc)
      print error
    end
  end

  def self.condicionAgenteA(tipo, distancia)
    begin
      if @sistema.getTipoAgente(tipo) != nil
        tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
        c = CondicionAgenteA.new(tipo, distancia)
        tpAgente.addCondicion(c)
      end
    rescue Error_TipoAgente_NoExiste => error
      print error
    rescue Error_Distancias => error
      print error
    end
  end

  def self.condicionPropiedadIgual(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      cond = CondicionPropiedad.new(:igual, propiedad, valor)
      tpAgente.addCondicion(cond)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    end
  end

  def self.condicionPropiedadMayor(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      cond = CondicionPropiedad.new(:mayor, propiedad, valor)
      tpAgente.addCondicion(cond)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    rescue Error_Operacion => error
      print error
    end
  end

  def self.condicionPropiedadMenor(propiedad, valor)
    begin
      tpAgente = @sistema.getTpAgente(@sistema.num_tpAgentes-1)
      tpAgente.comprobarPropiedades(propiedad, valor)
      cond = CondicionPropiedad.new(:menor, propiedad, valor)
      tpAgente.addCondicion(cond)
    rescue Error_Propiedad_Existe => error
      print error
    rescue Error_TipoDato => error
      print error
    rescue Error_Operacion => error
      print error
    end
  end

  def self.agente(nombre, tipo)
    begin
      @sistema.findAgenteNombre(nombre)
      tipoAgente = @sistema.getTipoAgente(tipo)
      a = Agente.new(nombre, tipoAgente)
      @sistema.addAgente(a)
      yield if block_given?
      a.allPropiedades
    rescue Error_NombreAgente_Existe => error
      print error
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

  def self.simular(tamanio, pasos)
    @sistema.simular(tamanio, pasos)
  end

  def self.getSistema
    @sistema
  end

  def self.mostrar
    @sistema.to_s
  end

end
