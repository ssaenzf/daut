
def clonar_perezoso(obj)
  
  clon = obj.class.allocate
  array_variables_cambiadas = Array.new
  obj.instance_variables.each do |name_instance_variable|
    instance_variable = obj.instance_variable_get(name_instance_variable)
    # Se hace un clonado superficial para las variables de instancia
    clon.instance_variable_set(name_instance_variable, instance_variable)
    array_variables_cambiadas.append(name_instance_variable)
  end
  # Se establece una variable que llevara un registro de que variables se han cambiado
  clon.instance_variable_set("array_variables_cambiadas", array_variables_cambiadas)
  # Se establecen variables para distinguir el objeto original de clon
  clon.instance_variable_set("original", false)
  obj.instance_variable_set("original", true)
  # Creacion metodos de clase
  obj.class.methods.grep(/=$/){define_method(name)}
    self.#{name} = asd
  }
    
  end
  
end