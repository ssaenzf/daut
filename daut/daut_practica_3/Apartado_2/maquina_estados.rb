require_relative 'Excepciones/Error_nombre_simple_compuesto_repetido'
module MaquinaEstadosDSL
	
	# Punto de entrada
	def self.maquinaEstados (&proc)
		maquina_estados = MaquinaEstados.new
		maquina_estados.instance_eval(&proc)
		maquina_estados
	end
	
	class MaquinaEstados

		def initialize(estado_inicial)
			@estados = []
			if estado_inicial.class != EstadoCompuesto && estado_inicial.class != EstadoSimple
				raise "El estado inicial introducido no se trata de un estado simple o compuesto"
			end
			@estado_inicial = estado_inicial
		end

		def estado_final (&proc)
			estado = EstadoFinal.new
			estado.instance_eval(&proc)
			@estados << estado
		end

		def estado_simple (inicial = False, nombre, &proc)
			estado = EstadoSimple.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				estado.instance_eval(&proc)
				@estados << estado
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

		def estado_historico (&proc)
			estado = EstadoHistoricos.new
			estado.instance_eval(&proc)
			@estados << estado
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
			@transiciones = transiciones
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
			end
		end
		def eql?(other)
			return (self.class == other.class @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
	end
		
	# Estado Compuesto
	class EstadoCompuesto
		def initialize (inicial = False, nombre)
			@inicial = inicial
			@nombre = nombre
			@estados = []
		end
		def ==(other)
			if (other.class == self.class)
			  	return (other.nombre == @nombre)
			end
		end
		def eql?(other)
			return (self.class == other.class @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
		attr_reader :estados
		def estados= (estados) # setter 
			cuenta = 0
			for estado in estados
				if estado.class == EstadoHistorico:
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
		   
	end
	
	# Estado Historico
	class EstadoHistorico
			
	end


	class Transicion
		def initialize(nombre_evento=nil)
			@nombre_evento = nombre_evento
		end
		def ==(other)
			if (other.class == self.class)
				if @nombre_evento != nil
					return (other.nombre_evento == @nombre_evento)
				end
			end
		end
		def eql?(other)
			if @nombre_evento != nil
				return (self.class == other.class @nombre == other.nombre)
			end
		end
	end
	class TransicionSimple < Transicion
		def initialize (origen, destino)
			@origen = origen
			@destino = destino
		end
	end

	class Bifuracion < Transicion
		def initialize (origen, *destinos)
			@origen = origen
			@destinos = destinos
		end
	end

	class Union < Transicion
		def initialize (destino, *origenes)
			@origen = origenes
			@destino = destino
		end
	end
	
end