class Libro
	def initialize
		@id = 0
		@tipo = "ij"
	end

	def to_s
		puts "Id: #{@id}. Tipo: #{@tipo}"
	end
end

y = Libro.new
for i in y.instance_variables
	puts y.instance_variable_get(i)
end

def clonar_superficial (obj)

	clon = obj.class.new

	for i in obj.instance_variables
		x = obj.instance_variable_get(i)
		clon.instance_variable_set(i, x)
	end

	clon
end

z = clonar_superficial(y)
puts z.to_s