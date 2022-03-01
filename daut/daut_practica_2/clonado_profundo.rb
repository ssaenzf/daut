# Necesario archivo clonado profundo
require_relative 'clonado_profundo'

def clonado_profundo(obj)
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
        clon.instance_variable_set(name_instance_variable, clonado_profundo(instance_variable))
      else
        clon.instance_variable_set(name_instance_variable, instance_variable)
      end
    end
  end
  return clon
end