require_relative 'SBasico'
require_relative 'SCombo'
require_relative 'ActGrupal'
require_relative 'Socio'

class Intercambio
  def initialize(socio, servicio)
    @socioReceptor = socio
    @servicio = servicio
    @numHoras = 0
    setNumHoras()
  end

  attr_accessor :socioReceptor, :servicio, :servicio, :numHoras

  def setNumHoras
    if !@servicio.instance_of?SCombo
      @numHoras = @servicio.horaFin - @servicio.horaIni
    else
      setNumHorasCombo(@servicio.listServicios)
    end
  end

  def setNumHorasCombo(servicios)
    servicios.each do |s|
      if s.instance_of?SCombo
        setNumHorasCombo(s.listServicios)
      else
        @numHoras += (s.horaFin - s.horaIni)
      end
    end
  end

  def to_s
    puts ("Socio: " + @socioReceptor.nombre + "\nServicio: " + @servicio.descripcion + "\nNúmero de horas: " + @numHoras.to_s + "\n")
  end

end
