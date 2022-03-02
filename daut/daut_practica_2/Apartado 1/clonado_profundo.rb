# Necesario archivo clonado profundo
require_relative 'clonado_profundo'

def clonado_profundo(obj, visibles)
  clon = obj.class.allocate
  obj.instance_variables.each do |name_instance_variable|
    variable_clonada = false
    instance_variable = obj.instance_variable_get(name_instance_variable)
    clon.instance_variables.each do |clon_name_instance_variable|
      clon_instance_variable = clon.instance_variable_get(clon_name_instance_variable)
      if clon_instance_variable == instance_variable
        variable_clonada = true
        if visibles == true
          if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
            clon.instance_variable_set(name_instance_variable, clon_instance_variable) # Se le copia el objeto clonado ya creado si hacen referencia al mismo
          end
        else
          clon.instance_variable_set(name_instance_variable, clon_instance_variable) # Se le copia el objeto clonado ya creado si hacen referencia al mismo
        end
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
        if visibles == true
          if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
            clon.instance_variable_set(name_instance_variable, hash) 
          end
        else
          clon.instance_variable_set(name_instance_variable, hash)
        end     
      end
      # En caso de que la variable de instancia sea una clase array
      if instance_variable.class==Array 
        array = []
        instance_variable.each do |valor|
          if valor.instance_variables.length > 0
            # Si el valor es un objeto se vuelve a llamar recursivamente a clonar profundo
            array.append(clonado_profundo(valor, visibles))
          else
            array.append(valor)
          end
        end
        if visibles == true
          if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
            clon.instance_variable_set(name_instance_variable, array)
          end
        else
          clon.instance_variable_set(name_instance_variable, array)
        end
      end
      # Si no es un hash ni un array se comprueba si es un objeto
      if instance_variable.instance_variables.length > 0
        # Si es un objeto se llama recursivamente a clonar profundo
        if visibles == true
          if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
            clon.instance_variable_set(name_instance_variable, clonado_profundo(instance_variable, visibles))
          end
        else
          clon.instance_variable_set(name_instance_variable, clonado_profundo(instance_variable, visibles))
        end
      else
        if visibles == true
          if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
            clon.instance_variable_set(name_instance_variable, instance_variable)
          end
        else
          clon.instance_variable_set(name_instance_variable, instance_variable)
        end
      end
    end
  end
  return clon
end