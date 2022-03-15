class Regla
  def initialize(nombre)
    @nombre = nombre
    @acciones = []
    @condiciones = []
  end

  def addAccion(accion)
    @acciones << accion
  end

  def addCondicion(cond)
    @condiciones << cond
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
