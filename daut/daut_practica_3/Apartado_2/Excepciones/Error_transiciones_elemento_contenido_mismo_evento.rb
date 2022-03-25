class Error_transiciones_elemento_contenido_mismo_evento < RuntimeError
	def initialize (nombre_evento)
		@nombre_evento = nombre_evento
	end
	attr_reader :nombre_evento
end
