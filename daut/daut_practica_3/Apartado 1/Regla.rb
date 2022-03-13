require_relative 'Acciones/AccionAsignarValor'
require_relative 'Acciones/AccionSumarValor'
require_relative 'Acciones/AccionRestarValor'
require_relative 'Acciones/AccionCrearAgente'
require_relative 'Acciones/AccionMoverseA'
require_relative 'Condiciones/CondicionAgenteA'
require_relative 'Condiciones/CondicionPropiedadIgual'
require_relative 'Condiciones/CondicionPropiedadMayor'
require_relative 'Condiciones/CondicionPropiedadMenor'

class Regla
  def initialize(nombre)
    @nombre = nombre
    @acciones = []
    @condiciones = []
  end

  def addAccion(accion, args)
    case accion
    when :asignarValor
      a = AccionAsignarValor.new(args[0], args[1])
    when :sumarValor
      a = AccionSumarValor.new(args[0], args[1])
    when :restarValor
      a = AccionRestarValor.new(args[0], args[1])
    when :crearAgente
      a = AccionCrearAgente.new(args[0])
    when :moverseA
      a = AccionMoverseA.new(args[0], args[1])
    else
      return
    end
    @acciones << a
  end

  def addCondicion(cond, args)
    case cond
    when :agenteA
      c = CondicionAgenteA.new(args[0], args[1])
    when :propiedadIgual
      c = CondicionPropiedadIgual.new(args[0], args[1])
    when :propiedadMayor
      c = CondicionPropiedadMayor.new(args[0], args[1])
    when :propiedadIgual
      c = CondicionPropiedadMenor.new(args[0], args[1])
    else
      return
    end
    @condiciones << c
  end

end
