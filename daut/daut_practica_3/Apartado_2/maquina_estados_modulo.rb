module MaquinaEstadosModulo
	
	# Punto de entrada
	def self.maquinaEstados(&proc)
		maquina_estados = MaquinaEstados.new
		maquina_estados.instance_eval(&proc)
		maquina_estados
	end
	
	class MaquinaEstados

		def initialize()
			@estados = []
			@transiciones = []
		end

		def transicionSimple (origen, destino)
			transicionsimple = TransicionSimple.new(origen, destino)
			@transiciones << transicionsimple
			transicionsimple
		end

		def bifuracion (origen, *destinos)
			bifuracion_unidad = Bifuracion.new(origen, destinos)
			@transiciones << bifuracion_unidad
			bifuracion_unidad
		end

		def union (destino, *origenes)
			union_unidad = Union.new(destino, *origenes)
			@transiciones << union_unidad
			union_unidad
		end

		def estado_final
			estado = EstadoFinal.new
			@estados << estado
			estado
		end

		def estado_simple (inicial = False, nombre)
			estado = EstadoSimple.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				@estados << estado
			end
		end

		def estado_compuesto (inicial = False, nombre, &proc)
			estado = EstadoCompuesto.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				estado.instance_eval(&proc)
				@estados << estado
			end
			estado
		end

		def estado_historico ()
			estado = EstadoHistoricos.new
			@estados << estado
			estado
		end
	end
	
	class Estado 
		def initialize ()
			@transiciones = []
		end
		attr_reader :transiciones
		def transiciones= (transiciones) # setter 
			for transicion1 in transiciones
				for transicion2 in transiciones
					if transicion1 == transicion2
						raise "Existe un estado que contiene dos transiciones con el mismo evento, #{transicion1.evento}"
					end
				end
			end
			transiciones
		end
	end
	# Estado Final
	class EstadoFinal
	end
		
	# Estado Simple
	class EstadoSimple
		def initialize (inicial = False, nombre)
			@inicial = inicial
			@nombre = nombre
		end
		def ==(other)
			if (other.class == self.class)
			  	return (other.nombre == @nombre)
			else
				return False
			end
		end
		def eql?(other)
			return (self.class == other.class && @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
	end
		
	# Estado Compuesto
	class EstadoCompuesto
		def initialize (inicial = False, nombre)
			@inicial = inicial
			@nombre = nombre
			@estados = []
			@transiciones = []
		end

		def transicionSimple (origen, destino)
			transicionsimple = TransicionSimple.new(origen, destino)
			@transiciones << transicionsimple
		end

		def bifuracion (origen, *destinos)
			bifuracion_unidad = Bifuracion.new(origen, destinos)
			@transiciones << bifuracion_unidad
		end

		def union (destino, *origenes)
			union_unidad = Union.new(destino, *origenes)
			@transiciones << union_unidad
		end

		def transiciones= (transiciones) # setter 
			transiciones_estado_compuesto = []
			for transicion in transiciones
				if transiciones_estado_compuesto.include?(transicion) 
					raise "El estado compuesto #{@nombre} no puede contener dos transiciones con el mismo nombre #{transicion.nombre_evento}\n"
				end
				transiciones_estado_compuesto.append(transicion)
			end
			# Si algun estado de los que contiene contiene repetida alguna transición directa o indirectamente se elimina
			for estado in estados
				for transicion in estado.obtener_conjunto_transiciones
					if transiciones_estado_compuesto.include?(transicion) 
						raise "El estado compuesto #{@nombre} no puede contener dos transiciones con el mismo nombre #{transicion.nombre_evento}, a través de estados inferiores\n"
					end
				end
			end

			transiciones
		end
		def obtener_conjunto_transiciones 
			transiciones_estado_compuesto = []
			for transicion in transiciones
				transiciones_estado_compuesto.append(transicion)
			end
			for estados in estados
				transiciones_estado_compuesto.append(estado.obtener_conjunto_transiciones)
			end
			transiciones_estado_compuesto
		end
		def ==(other)
			if (other.class == self.class)
			  	return (other.nombre == @nombre)
			else
				return False
			end
		end
		def eql?(other)
			return (self.class == other.class and @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
		attr_reader :estados
		def estados= (estados) # setter 
			cuenta = 0
			for estado in estados
				if estado.class == EstadoHistorico
					for estado in estados
						if estado.inicial == true
							raise "El estado compuesto #{@nombre} no puede contener un estado inicial y uno histórico\n"
						end
					end
					cuenta += 1
				end
				if cuenta == 2
					raise "Se esta intentando introducir más de una clase historica dentro de un estado compuesto #{@nombre}\n"
				end
			end
			@estados = estados
		end
		def estado_final ()
			estado = EstadoFinal.new
			@estados << estado
		end

		def estado_simple (inicial = False, nombre)
			estado = EstadoSimple.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				@estados << estado
			end
		end

		def estado_compuesto (inicial = False, nombre, &proc)
			estado = EstadoCompuesto.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				estado.instance_eval(&proc)
				@estados << estado
			end
		end

		def estado_historico ()
			estado = EstadoHistoricos.new
			@estados << estado
		end
		   
	end
	
	# Estado Historico
	class EstadoHistorico
			
	end


	class Evento
		def initialize(nombre_evento)
			@nombre_evento = nombre_evento
		end
		def ==(other)
			if (other.class == self.class)
				if @nombre_evento != nil
					return (other.nombre_evento == @nombre_evento)
				else
					return False
				end
			else
				return False
			end
		end
		def eql?(other)
			if @nombre_evento != nil
				return (self.class == other.class and @nombre == other.nombre)
			end
		end
	end

	class TransicionSimple 
		def initialize (origen, destino)
			@origen = origen
			@destino = destino
		end
		def evento(nombre)
			@evento = Evento.new(nombre)
		end
		attr_accessor :origen, :destinos
	end

	class Bifuracion 
		def initialize (origen, *destinos)
			@origen = origen
			@destino = destinos
		end
		def evento(nombre)
			@evento = Evento.new(nombre)
		end
		attr_accessor :origen, :destinos
	end

	class Union 
		def initialize (destino, *origenes)
			@origen = origenes
			@destino = destino
		end
		def evento(nombre)
			@evento = Evento.new(nombre)
		end
		attr_accessor :origen, :destino
	end
end