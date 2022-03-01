require_relative 'Filtro'
require_relative 'Registro'
require_relative 'Error_Filtro_NoExiste'

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
    @filtros.each do |f|
      if f.nombre == filtro_nombre
        @filtros.delete(f)
        puts "Filtro #{filtro_nombre} eliminado"
      end
    end
  end

  def mostrarFiltros
    @filtros.each do |f|
      puts f.to_s
    end
  end

  def buscar(filtro, args)
    filtros = filtro.split('_')[1..-1] # Filtros a aplicar
    condiciones = []
    filtros.each do |f|
      @filtros.each do |f1|
        condiciones.append(f1) if f.index(f1.nombre)
      end
      raise Error_Filtro_NoExiste.new(f), "El filtro #{f} no existe\n" if condiciones.empty?
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
          if arity > 1
            _args.append(r.campos[c.campo])
            _args += args[pos..(pos + (pos_arg-1))]
          else
            _args = r.campos[c.campo]
          end
          _regs.append(r) if c.applyFiltro(_args) == true
        end
      end
      pos += pos_arg
      regs = regs && _regs
    end
    regs
  end

  def method_missing(method, *_args)
    if @@accesos.key?(method)
      @@accesos[method] += 1
    else
      @@accesos[method] = 1
    end
    puts "Llamaste al método #{method}"
    begin
      buscar(method.to_s, _args)
    rescue Error_Filtro_NoExiste => error
      print error
    end
  end

  attr_reader :filtros, :registros

  def mostrarAccesos
    puts @@accesos.to_s
  end
end
