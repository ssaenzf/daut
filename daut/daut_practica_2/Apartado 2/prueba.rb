class MiClase
  def MiClase.crear_metodos
      # forma 1: dentro de un método singleton de clase
      define_method (:mi_metodo1) do |param|
        puts param * 3
      end
  end
end

MiClase.crear_metodos
objeto = MiClase.new
objeto.mi_metodo1(2)
# 6

s = "buscar_rangoEdad_tieneMascota"
puts s.split('_')

a = [1, 2, 3]
b = [1, 2]
print a && b
