def clonado_superficial (obj)

  clon = obj.class.allocate

  for i in obj.instance_variables
    x = obj.instance_variable_get(i)
    clon.instance_variable_set(i, x)
  end

  clon
end
