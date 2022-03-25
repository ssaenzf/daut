class Error_estados_mismo_nombre < RuntimeError
	def initialize (nombre)
		@nombre = nombre
	end
	 attr_reader :nombre
end
