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
      a = AccionAsignarValor.new(accion, args[0], args[1])
    when :sumarValor
      a = AccionSumarValor.new(accion, args[0], args[1])
    when :restarValor
      a = AccionRestarValor.new(accion, args[0], args[1])
    when :crearAgente
      a = AccionCrearAgente.new(accion, args[0])
    when :moverseA
      a = AccionMoverseA.new(accion, args[0], args[1])
    else
      return
    end
    @acciones << a
  end

  def addCondicion(cond, args)
    case cond
    when :agenteA
      c = CondicionAgenteA.new(cond, args[0], args[1])
    when :propiedadIgual
      c = CondicionPropiedadIgual.new(cond, args[0], args[1])
    when :propiedadMayor
      c = CondicionPropiedadMayor.new(cond, args[0], args[1])
    when :propiedadIgual
      c = CondicionPropiedadMenor.new(cond, args[0], args[1])
    else
      return
    end
    @condiciones << c
  end

  def to_s
    puts "Regla: #{@nombre}"
    puts "Acciones: \n"
    (@acciones.each do |a|
      a.to_s
    end).to_s
    puts "Condiciones: \n"
    (@condiciones.each do |t|
      t.to_s
    end).to_s
  end
end
