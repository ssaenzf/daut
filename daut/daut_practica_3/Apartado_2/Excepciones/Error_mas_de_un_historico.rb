class Error_mas_de_un_historico < RuntimeError
	def initialize (nombre)
		@nombre = nombre
	end
	 attr_reader :nombre
end
