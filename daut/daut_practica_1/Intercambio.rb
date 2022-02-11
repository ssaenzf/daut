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
    calcularIntercambio()
  end

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

  def calcularIntercambio
    if @servicio.instance_of?ActGrupal
      saldoDescuento = @numHoras * 60
      saldoAumento = saldoDescuento/@servicio.colaboradores.size
      if (@socioReceptor.saldo - saldoDescuento) >= 0
        @socioReceptor.saldo -= saldoDescuento
      else
        @socioReceptor.saldo = 0
      end
      @servicio.colaboradores.each do |c|
        c.saldo += saldoAumento
      end
    else
      nuevoSaldo = @numHoras * 60
      if (@socioReceptor.saldo - nuevoSaldo) >= 0
        @socioReceptor.saldo -= nuevoSaldo
      else
        @socioReceptor.saldo = 0
      end
      @servicio.socio.saldo += nuevoSaldo
    end
  end

  def to_s
    puts ("Socio: " + @socioReceptor.nombre + "\nServicio: " + @servicio.descripcion + "\nNúmero de horas: " + @numHoras.to_s + "\n")
  end

end
