def clonado_superficial (obj, visibles)
  clon = Object.const_get(obj.class.to_s).new

  for i in obj.instance_variables
    if visibles == true
     if obj.class.instance_methods.include?(i[1, i.length].concat("="))==true
       x = obj.instance_variable_get(i)
      clon.instance_variable_set(i, x)
     end
    else 
      x = obj.instance_variable_get(i)
      clon.instance_variable_set(i, x)
    end
  end
  clon
end
