require_relative 'Codigo_categoria_error'
require_relative 'Codigo_subcategoria_error'
require_relative 'Descripcion_subcategoria_error'

class Categoria
  def initialize (codigo, descripcion, categoria_padre = nil)
    @descripcion = descripcion
    if @@codigos.index(codigo)  # devuelve numero de elementos que se corresponden con su argumento
      raise Codigo_categoria_error.new(codigo), "El codigo #{codigo} para esta categoría ya lo contiene otra categoria.\n"
    end
    @codigo = codigo
    @@codigos = @@codigos.push(codigo)
    if categoria_padre
      categoria_padre.add_subcategoria(self)
    end
    @subcategorias = Array.new()
  end
  
  attr_accessor :descripcion, :codigo, :subcategorias
 
  @@codigos = Array.new()
    
  def self.codigos
      @@codigos
  end
  def self.codigos=(cod)
      @@codigos = cod
  end  
  
  def add_subcategoria(subcategoria)
    if !subcategoria.codigo.start_with?(@codigo)
      raise Codigo_subcategoria_error.new(subcategoria.codigo, @codigo), "El codigo para esta subcategoria #{subcategoria.codigo} es incompatible con el de la categoria padre #{@codigo}.\n"
    end
    @subcategorias.each do |sub|
      if sub.descripcion == subcategoria.descripcion
        raise Descripcion_subcategoria_error.new(sub.descripcion), "La descripcion #{subcategoria.descripcion} ya la tiene otra subcategoria de la misma categoria padre\n"
      end
      sub.subcategorias_contienen_descripcion(subcategoria.descripcion)
    end
    @subcategorias = @subcategorias.push(subcategoria)
  end
  
  def subcategorias_contienen_descripcion(descripcion)
    @subcategorias.each do |sub|
      if sub.descripcion == descripcion
        raise Descripcion_subcategoria_error.new(sub.descripcion), "La descripcion #{descripcion} ya la tiene otra subcategoria de la misma categoria padre\n"
      end
      sub.subcategorias_contienen_descripcion(descripcion)
    end
  end
  def to_s ()
    puts(@codigo + ' - ' + @descripcion)
  end
end