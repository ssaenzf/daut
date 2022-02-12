require_relative 'Socio'
require_relative 'Categoria'
require_relative 'Intercambio'
require_relative 'SBasico'
require_relative 'SCombo'
require_relative 'ActGrupal'
require_relative 'Codigo_categoria_error'
require_relative 'Codigo_subcategoria_error'
require_relative 'Descripcion_subcategoria_error'

module Estadisticas
  def min (list)
    list.min
  end

  def max (list)
    list.max
  end

  def medio (list)
    list.inject(0.0){|sum,x| sum+x}/list.size
  end
end


class Banco
  include Estadisticas
  def initialize()
    @listSocios = Array.new
    @listServicios = Array.new
    @listCategorias = Array.new
    @listIntercambios = Array.new
  end
  attr_accessor :listServicios, :listSocios, :listCategorias, :listIntercambios

  def crearSocio(nombre, nif, telefono)
    s = Socio.new(nombre, nif, telefono)
    @listSocios.append(s)
    s
  end

  def mostrarSocios()
    i = 1
    puts "***** LISTA SOCIOS *****"
    @listSocios.each do |s|
      puts "Socio #{i}"
      s.to_s
      puts "\n"
      i += 1
    end
  end

  def crearCategoria(codigo, descripcion, categoria_padre = nil)
    begin
      c = Categoria.new(codigo, descripcion, categoria_padre)
    rescue Codigo_categoria_error => error
      print error
    rescue Codigo_subcategoria_error => error
      print error
    rescue Descripcion_subcategoria_error => error
      print error
    else
      @listCategorias.append(c)
      c
    end
  end

  def mostrarCategorias()
    puts "***** LISTA CATEGORIAS *****"
    @listCategorias.each do |c|
      c.to_s
    end
  end

  def crearServicoBasico(descripcion, socio, categoria, horaIni, horaFin, *dias)
    s = SBasico.new(descripcion, socio, categoria, horaIni, horaFin, *dias)
    @listServicios.append(s)
    s
  end

  def crearServicoCombo(descripcion, socio, *servicios)
    s = SCombo.new(descripcion, socio, *servicios)
    @listServicios.append(s)
    s
  end

  def crearActGrupal(descripcion, socio, categoria, min_asistentes, horaIni, horaFin, dia, *colaboradores)
    s = ActGrupal.new(descripcion, socio, categoria, min_asistentes, horaIni, horaFin, dia, *colaboradores)
    @listServicios.append(s)
    s
  end

  def mostrarServicios
    puts "***** LISTA SERVICIOS *****"
    @listServicios.each do |s|
      s.to_s
      puts "\n"
    end
  end

  def crearIntercambio(socio, servicio)
    i = Intercambio.new(socio, servicio)
    @listIntercambios.append(i)
    calcularIntercambio(i)
  end

  def calcularIntercambio(int)
    if int.servicio.instance_of?ActGrupal
      saldoDescuento = int.numHoras * 60
      saldoAumento = saldoDescuento/int.servicio.colaboradores.size
      if (int.socioReceptor.saldo - saldoDescuento) >= 0
        int.socioReceptor.saldo -= saldoDescuento
      else
        int.socioReceptor.saldo = 0
      end
      int.servicio.colaboradores.each do |c|
        c.saldo += saldoAumento
      end
    else
      nuevoSaldo = int.numHoras * 60
      if (int.socioReceptor.saldo - nuevoSaldo) >= 0
        int.socioReceptor.saldo -= nuevoSaldo
      else
        int.socioReceptor.saldo = 0
      end
      int.servicio.socio.saldo += nuevoSaldo
    end
  end

  def mostrarIntercambios
    x = 1
    puts "***** LISTA INTERCAMBIOS *****"
    @listIntercambios.each do |i|
      puts "Intercambio #{x}"
      i.to_s
      puts "\n"
      x += 1
    end
  end

  def mostrarSaldos
    puts "***** LISTA SALDOS ACTUALES *****"
    @listSocios.each do |s|
      puts("Saldo actual de #{s.nombre}: #{s.saldo}\n")
    end
    puts "\n"
  end

  def mostrarEstadisticas
    listHoras = Array.new
    @listIntercambios.each do |i|
      listHoras.append(i.numHoras)
    end
    puts "***** ESTADÍSTICAS *****"
    puts "Intercambio más corto: " + min(listHoras).to_s + " hora/s"
    puts "Intercambio más largo: " + max(listHoras).to_s + " hora/s"
    puts "Duración media de intercambios: " + medio(listHoras).round(2).to_s + " hora/s"
    puts "Número medio de intercambios por servicio: "
  end

end