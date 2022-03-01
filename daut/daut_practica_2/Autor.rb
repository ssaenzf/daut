class Autor
  def initialize
    @nombre = 'Pepito'        # Clonado recursivo, debera clonar tambien las variables de objetos que contenga
  end
  
  def ==(other)
    if (other.class == self.class)
      return (other.nombre == @nombre)
    end
  end
  attr_accessor :nombre
end