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

class Libro
  def initialize(autor)
    @id = 5
    @tipo = "Western"
    @autor = autor
    @autor2 = autor # Varias variables de instancia referenciando un mismo objeto
    @subcategorias = ["Comedia", "Drama", "Belica"] # Variable de instancia de tipo array
    @protagonistas = {"El_bueno" => "Clint Eastwood", "El_feo" => "Eli Wallach"} # Variable de instancia de tipo hash
  end
  attr_accessor :id, :tipo, :autor, :autor2, :subcategorias, :protagonistas

  def to_s
    puts "Libro: id #{@id}, tipo #{@tipo}, autor #{@autor} autor2 #{@autor2} subcategorias #{@subcategorias.to_s} protagonistas #{@protagonistas.to_s}\n Autor: #{@autor.nombre}"
  end
end

def clonar_profundo(obj)
  clon = obj.class.allocate
  obj.instance_variables.each do |name_instance_variable|
    variable_clonada = false
    instance_variable = obj.instance_variable_get(name_instance_variable)
    clon.instance_variables.each do |clon_name_instance_variable|
      clon_instance_variable = clon.instance_variable_get(clon_name_instance_variable)
      if clon_instance_variable == instance_variable
        variable_clonada = true
        clon.instance_variable_set(name_instance_variable, clon_instance_variable) # Se le copia el objeto clonado ya creado si hacen referencia al mismo
      end
    end
    if variable_clonada == false
      # En caso de que la variable de instancia sea una clase hash
      if instance_variable.class==Hash 
        hash = {}
        instance_variable.each do |clave, valor|
          if valor.instance_variables.length > 0
            # Si el valor es un objeto se vuelve a llamar recursivamente a clonar profundo
            hash[clave] = clonar_profundo(valor)
          else
            hash[clave] = valor
          end
        end
        clon.instance_variable_set(name_instance_variable, hash)      
      end
      # En caso de que la variable de instancia sea una clase array
      if instance_variable.class==Array 
        array = []
        instance_variable.each do |valor|
          if valor.instance_variables.length > 0
            # Si el valor es un objeto se vuelve a llamar recursivamente a clonar profundo
            array.append(clonar_profundo(valor))
          else
            array.append(valor)
          end
        end
        clon.instance_variable_set(name_instance_variable, array)
      end
      # Si no es un hash ni un array se comprueba si es un objeto
      if instance_variable.instance_variables.length > 0
        # Si es un objeto se llama recursivamente a clonar profundo
        clon.instance_variable_set(name_instance_variable, clonar_profundo(instance_variable))
      else
        clon.instance_variable_set(name_instance_variable, instance_variable)
      end
    end
  end
  return clon
end

autor = Autor.new
y = Libro.new(autor)
z = clonar_profundo(y)
puts z
