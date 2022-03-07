def clonado_perezoso(obj, visibles)
  
  clon = obj.class.allocate
  array_variables_cambiables = Array.new
  obj.instance_variables.each do |name_instance_variable|
    instance_variable = obj.instance_variable_get(name_instance_variable)
    # Se hace un clonado superficial para las variables de instancia
    if visibles == true
      if clon.class.instance_methods.include?(name_instance_variable[1, name_instance_variable.length].concat("="))==true
        clon.instance_variable_set(name_instance_variable, instance_variable)
      end
    else 
        clon.instance_variable_set(name_instance_variable, instance_variable)
    end
    array_variables_cambiables.append(name_instance_variable) # Las variables de instancia se aniaden al conjunto de variables que podra modificar
  end

  # Se establece una variable que llevara un registro de que variables se han cambiado del clon
  clon.instance_variable_set("@array_variables_cambiables", array_variables_cambiables)
  # Se establecen variable booleana original para distinguir el objeto original de clon
  clon.instance_variable_set("@original", false)

  # En caso de que sea el primer clon se crea un array con el conjunto de clones que contiene el objeto original
  # y se establece su variable original a true para distinguirlo de los clones, en caso de que no sea el primer 
  # clon que se añade se añade al array de clones ya creado
  if (obj.class.instance_variable_defined? :@array_clones)
    obj.array_clones.append(clon)
  else
    obj.instance_variable_set("@array_clones", Array.new.append(clon)) 
    obj.instance_variable_set("@original", true)
    # Instanciacion dinámica metodo propagar y metodo =
    # Se debe hacer para todas las variables de instancia, incluidas estas que he añadido(array_variables_cambiables, original, array_clones)
    obj.class.send(:define_method , "array_variables_cambiables=" ) do param
      @array_variables_cambiables = param
    end
    obj.class.send(:define_method , "array_variables_cambiables" ) do
      return @array_variables_cambiables
    end
    obj.class.send(:define_method , "original=" ) do param
      @original = param
    end
    obj.class.send(:define_method , "original" ) do
      return @original
    end
    obj.instance_variables.each do |name_instance_variable|
      nombre = name_instance_variable.to_s
      nombre = nombre[1, nombre.length].concat("=")
      obj.class.send(:define_method , nombre.to_s) do |param|
        if visibles == true
          if clon.class.instance_methods.include?(i[1, i.length].concat("="))==true
            self.instance_variable_set(name_instance_variable, param)
          end
        else 
          self.instance_variable_set(name_instance_variable, param)
        end
        # Si no es el original se cambia su valor y se quita de la lista de variables cambiables
        if @original == false
          @array_variables_cambiables.delete(name_instance_variable)
        # Si es el original se modifica y su valor se propaga en los clones que no hayan cambiado antes el valor de la variable
        else 
          @array_clones.each do |clon|
            # Se identifica si se puede propagar o no el valor
            if clon.array_variables_cambiables.include? name_instance_variable
              if clon.instance_variable_get(name_instance_variable).instance_variables.length > 0 
                if visibles == true
                  if clon.class.instance_methods.include?(i[1, i.length].concat("="))==true
                    clon.instance_variable_set(name_instance_variable, clonado_profundo(param))
                  end
                else 
                  clon.instance_variable_set(name_instance_variable, clonado_profundo(param))
                end
              else 
              if visibles == true
                if clon.class.instance_methods.include?(i[1, i.length].concat("="))==true
                  clon.instance_variable_set(name_instance_variable, param)
                end
              else 
                clon.instance_variable_set(name_instance_variable, param)
              end
              end
              clon.array_variables_cambiables.delete(name_instance_variable)
            end
          end
        end
      end
    end
  end  
  return clon
end