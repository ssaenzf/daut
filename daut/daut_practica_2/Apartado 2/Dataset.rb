require_relative 'Filtro'
require_relative 'Registro'
require_relative 'Error_Filtro_NoExiste'
require_relative 'Error_Filtro_Parametros'

class Dataset
  def initialize
    @registros = []
    @filtros = []
  end

  @@accesos = {}

  def addRegistro(reg)
    @registros.append(reg)
  end

  def mostrarRegistros
    @registros.each do |r|
      puts r.to_s
    end
  end

  def addFiltro(nombre, campo, &bloque)
    @filtros.append(Filtro.new(nombre, campo, bloque))
  end

  def delFiltro(filtro_nombre)
    filtroDel = false
    @filtros.each do |f|
      if f.nombre == filtro_nombre
        @filtros.delete(f)
        puts "Filtro #{filtro_nombre} eliminado"
        filtroDel = true
      end
    end
    if filtroDel
      self.methods.each do |m|
        if m.to_s.include? filtro_nombre
          self.class.remove_method m
          @@accesos.delete(m)
          puts "Método #{m} eliminado"
        end
      end
    else
      puts "Filtro #{filtro_nombre} no existe"
    end
  end

  def mostrarFiltros
    @filtros.each do |f|
      puts f.to_s
    end
  end

  def buscar(filtro, args=nil)
    filtros = filtro.split('_')[1..-1] # Filtros a aplicar
    condiciones = []
    filtros.each do |f|
      filtroExiste = false
      @filtros.each do |f1|
        if f.index(f1.nombre)
          condiciones.append(f1)
          filtroExiste = true
        end
      end
      raise Error_Filtro_NoExiste.new(f), "El filtro #{f} no existe\n" unless filtroExiste
    end

    pos = 0
    regs = []
    _regs = []
    condiciones.each do |c|
      arity =  c.condicion.arity
      pos_arg = arity - 1
      _regs = []
      @registros.each do |r|
        if r.campos.has_key?(c.campo)
          _args = []
          _args.append(r.campos[c.campo])
          if arity > 1
            _args += args[pos..(pos + (pos_arg-1))]
          end
          begin
            _regs.append(r) if c.applyFiltro(_args) == true
          rescue Error_Filtro_Parametros => error
            print error
          end
        end
      end
      pos += pos_arg
      regs &&= _regs
    end
    regs
  end

  def method_missing(method, *_args)
    regs = []
    puts "Llamaste al método #{method}"
    begin
      regs = buscar(method.to_s, _args)
    rescue Error_Filtro_NoExiste => error
      print error
    else
      if @@accesos.key?(method)
        @@accesos[method] += 1
        if @@accesos[method] >= 10
          self.class.send(:define_method, method) do |*param|
            puts method.to_s
            begin
              return buscar(method.to_s, param)
            rescue Error_Filtro_NoExiste => error
              print error
            end
          end
        end
      else
        @@accesos[method] = 1
      end
    end
    regs
  end

  attr_reader :filtros, :registros

  def mostrarAccesos
    puts @@accesos.to_s
  end
end
