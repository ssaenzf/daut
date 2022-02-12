require_relative 'SBasico'
require_relative 'SCombo'
require_relative 'ActGrupal'
require_relative 'Socio'
require_relative 'Error_Saldo_Intercambio'

class Intercambio
  def initialize(socio, servicio)
    @servicio = servicio
    @numHoras = 0
    setNumHoras()
    if socio.saldo == 0 || (socio.saldo - @numHoras*60 < 0)
      raise Error_Saldo_Intercambio.new(socio, servicio), "El socio #{socio.nombre} no dispone del saldo suficiente para solicitar el servicio #{servicio.descripcion}\n"
    end
    @socioReceptor = socio
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

  private :setNumHoras, :setNumHorasCombo

end
