class Error_inicial_y_historico < RuntimeError

	def initialize (inicial)
		@nombre_inicial = inicial
	end

	attr_reader :nombre
end
