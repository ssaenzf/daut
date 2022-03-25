require_relative 'Excepciones/Error_mas_de_un_historico'
require_relative 'Excepciones/Error_estados_mismo_nombre'
require_relative 'Excepciones/Error_mas_de_un_inicial'
require_relative 'Excepciones/Error_inicial_y_historico'
require_relative 'Excepciones/Error_transiciones_elemento_mismo_evento'
require_relative 'Excepciones/Error_transiciones_elemento_contenido_mismo_evento'

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
		
		def plant_uml(fichero)
			fichero.puts("@startuml\n")
			fichero.puts("hide empty description\n")
		    for estado in @estados
		    	if estado.class == EstadoSimple
		    		fichero.puts("state #{estado.nombre}\n")
		    	elsif estado.class == EstadoCompuesto
		    		estado.plant_uml(fichero, 0)
		    	end
		    end
		    for transicion in @transiciones
		    	string_transicion = ""
				for origen in Array(transicion.origen)
					for destino in Array(transicion.destino)
						if (origen.class == EstadoFinal)
							string_transicion += "[*] --> "
						elsif origen.class == EstadoSimple or origen.class == EstadoCompuesto
							if origen.inicial == true
								string_transicion += "[*] --> "
							else
								string_transicion += "#{origen.nombre} --> "
							end
						else
							string_transicion += "[H] --> "
						end
						if (destino.class == EstadoFinal)
							string_transicion += "[*]"
							# Mirar si contiene evento
							if transicion.hay_evento == true
								string_transicion += " : #{transicion.accion.nombre_evento}\n"
								fichero.puts(string_transicion)
							else 
								string_transicion += "\n"
								fichero.puts(string_transicion)
							end
						elsif destino.class == EstadoSimple or destino.class == EstadoCompuesto
							string_transicion += "#{destino.nombre}"
							if transicion.hay_evento == true
								fichero.puts(string_transicion + " : #{transicion.accion.nombre_evento}\n")
							else 
								fichero.puts(string_transicion + "\n")
							end
						else
							string_transicion += "[H]"
							if transicion.hay_evento == true
								fichero.puts(string_transicion + " : #{transicion.accion.nombre_evento}\n")
							else 
								fichero.puts(string_transicion + "\n")
							end
						end
					end
				end
		    end
		    fichero.puts("@enduml\n")
		end
		
		def errores_transiciones
			for transicion1 in @transiciones.flatten
				if transicion1.hay_evento != false
					for transicion2 in @transiciones
						if transicion2.hay_evento != false
							if transicion1 != transicion2
								if transicion1.accion.nombre_evento == transicion2.accion.nombre_evento
									# Nombres eventos origen
									if (Array(transicion1.origen) & Array(transicion2.origen)).empty? == false
										raise Error_transiciones_elemento_mismo_evento.new(transicion1.accion.nombre_evento), "Error, transiciones salientes de un mismo elemento con el mismo nombre #{transicion1.accion.nombre_evento}\n"		
									end
								end
							end
						end
					end
				end
			end
		end
		def errores()
			estados_asignacion = @estados
			estados_visitado = [] 
			num_estados_iniciales = 0
			for estado in estados_asignacion
				if estado == EstadoCompuesto
					estados_asignacion.append(estado.obtener_conjunto_estados)
				end
			end
			for estado in estados_asignacion
				if estado.class == EstadoSimple or estado.class == EstadoCompuesto
					if estado.inicial == true
						num_estados_iniciales = num_estados_iniciales + 1
						if num_estados_iniciales > 1
							raise Error_mas_de_un_inicial.new(), "Error,creacion de mas de un estado inicial para la maquina de estados\n"
						end
					end
				end
				for estado_aux in estados_visitado
					if estado.eql?(estado_aux)
						raise Error_estados_mismo_nombre.new(estado.nombre), "Error, dos estados tienen el mismo nombre, denominado #{estado.nombre}\n"
					end
				end
				estados_visitado.append(estado)
			end
			@estados = estados_asignacion
		end
		
		
		def to_s()
		    puts("Maquina de estados \n")
		    if @estados.empty? == false
				puts("Estados maquina de estados:\n")
				for estado in @estados
		    		estado.to_s()
		    	end
		    end
		    if @transiciones.empty? == false
				puts("Transiciones maquina de estados:\n")
				for transicion in @transiciones
		    		transicion.to_s()
		    	end
		    end
		end

		def transicionSimple (origen, destino, &proc)
			transicionsimple = TransicionSimple.new(origen, destino)
			transicionsimple.instance_eval(&proc)
			@transiciones << transicionsimple
			errores_transiciones()
		end

		def bifuracion (origen, *destinos, &proc)
			bifuracion_unidad = Bifuracion.new(origen, destinos)
			bifuracion_unidad.instance_eval(&proc)
			@transiciones << bifuracion_unidad
			errores_transiciones()
		end

		def union (destino, *origenes, &proc)
			union_unidad = Union.new(destino, *origenes)
			union_unidad.instance_eval(&proc)
			@transiciones << union_unidad
			errores_transiciones()
		end

		def estado_final
			estado = EstadoFinal.new
			@estados << estado
			errores
		end

		def estado_simple (inicial = false, nombre)
			estado = EstadoSimple.new(inicial, nombre)
			@estados =  @estados.append(estado)
			errores()
		end

		def estado_compuesto (inicial = false, nombre, &proc)
			estado = EstadoCompuesto.new(inicial, nombre)
			estado.instance_eval(&proc)
			@estados << estado
			errores
		end
	end
	# Estado Final
	class EstadoFinal
		def to_s()
			puts "Estado final\n"
		end
	end
		
	# Estado Simple
	class EstadoSimple
		def initialize (inicial = false, nombre)
			@inicial = inicial
			@nombre = nombre
		end
		def to_s()
			puts("Estado Simple nombre: #{@nombre}, inicial: #{@inicial}\n")
		end
		def ==(other)
			if (other.class == self.class or other.class == EstadoCompuesto)
			  	return (other.nombre == @nombre)
			else
				return false
			end
		end
		def eql?(other)
			return ((self.class == other.class or other.class == EstadoCompuesto) and @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
	end
		
	# Estado Compuesto
	class EstadoCompuesto
		def initialize (inicial = FALSE, nombre)
			@inicial = inicial
			@nombre = nombre
			@estados = []
			@transiciones = []
		end
		def to_s()
			puts("Estado compuesto nombre: #{@nombre}, inicial: #{@inicial}\n")
			if @estados.empty? == false
				puts("Estados del compuesto:\n")
				for estado in @estados
		    		estado.to_s()
		    	end
		    end
		    if @transiciones.empty? == false
				puts("Transiciones del compuesto:\n")
				for transicion in @transiciones
		    		transicion.to_s()
		    	end
		    end
		end
		
		def plant_uml(fichero, iteraciones)
			fichero.puts("state #{@nombre} {\n")
			iteraciones = iteraciones + 2
			for estado in @estados
				string_transicion = ""
				t = 0
			    while t < iteraciones
			    	string_transicion += " "
			    	t = t + 1
			    end
		    	if estado.class == EstadoSimple
		    		if estado.inicial == true
		    			fichero.puts(string_transicion + "state [*]\n")
		    		else
		    			fichero.puts(string_transicion + "state #{estado.nombre}\n")
		    		end
		    	elsif estado.class == EstadoCompuesto
		    		estado.plant_uml(fichero, iteraciones)
		    	end
		    end
		    for transicion in @transiciones
		    	string_transicion = ""
		    	t = 0
		    	while t < iteraciones
		    		string_transicion += " "
		    		t = t + 1
		    	end
				for origen in Array(transicion.origen)
					for destino in Array(transicion.destino)
						if (origen.class == EstadoFinal)
							string_transicion += "[*] --> "
						elsif origen.class == EstadoSimple or origen.class == EstadoCompuesto
							if origen.inicial == true
								string_transicion += "[*] --> "
							end
						else
							string_transicion += "#{origen} --> "
						end
						if (destino.class == EstadoFinal)
							string_transicion += "[*]"
							# Mirar si contiene evento
							if transicion.hay_evento == true
								string_transicion += " : #{transicion.accion.nombre_evento}\n"
							else 
								string_transicion += "\n"
							end
						else
							string_transicion += "#{destino}"
							if transicion.hay_evento == true
								string_transicion += " : #{transicion.accion.nombre_evento}"
							else 
								string_transicion += "\n"
							end
						end
					end
				end
				fichero.puts(string_transicion)
		    end
		    fichero.puts("}\n")
		end
		
		def errores_transiciones
			conjunto_transiciones_elemento = @transaciones
			conjunto_transiciones_sub_elemento = obtener_conjunto_transiciones_sub_elemento.flatten
			if (Array(conjunto_transiciones_elemento).empty? == false and Array(conjunto_transiciones_sub_elemento).empty? == false)
				for transicion1 in conjunto_transiciones_elemento
					if transicion1.hay_evento != false
						for transicion2 in conjunto_transiciones_sub_elemento
							if transicion2.hay_evento != false
								if transicion1 != transicion2
									if transicion1.accion.nombre_evento == transicion2.accion.nombre_evento
										# Nombres eventos origen
										raise Error_transiciones_elemento_contenido_mismo_evento.new(transicion1.accion.nombre_evento), "Error, transiciones salientes de un elemento y un elemento contenido, con el mismo nombre #{transicion1.accion.nombre_evento}\n"		
									end
								end
							end
						end
					end
				end
			end
		end

		def transicionSimple (origen, destino)
			transicionsimple = TransicionSimple.new(origen, destino)
			@transiciones << transicionsimple
			errores_transiciones
		end

		def bifuracion (origen, *destinos)
			bifuracion_unidad = Bifuracion.new(origen, destinos)
			@transiciones << bifuracion_unidad
			errores_transiciones
		end

		def union (destino, *origenes)
			union_unidad = Union.new(destino, *origenes)
			@transiciones << union_unidad
			errores_transiciones
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
			@transiciones = transiciones
		end
		def obtener_conjunto_transiciones_sub_elemento
			transiciones_estado_compuesto = []
			for estado in @estados
				if estado.class == EstadoCompuesto
					transiciones_estado_compuesto.append(estado.obtener_conjunto_transiciones)
				end
			end
			return transiciones_estado_compuesto
		end
		def obtener_conjunto_transiciones 
			transiciones_estado_compuesto = @transiciones
			for estado in @estados
				if estado.class == EstadoCompuesto
					transiciones_estado_compuesto.append(estado.obtener_conjunto_transiciones)
				end
			end
			transiciones_estado_compuesto
		end
		def ==(other)
			if (other.class == self.class or other.class == EstadoSimple)
			  	return (other.nombre == @nombre)
			else
				return false
			end
		end
		def eql?(other)
			return ((self.class == other.class or other.class == EstadoSimple) and @nombre == other.nombre)
		end
		attr_accessor :nombre, :inicial
		attr_reader :estados
		def errores
			estados_asignacion = @estados
			for estado in estados_asignacion
				if estado.class == EstadoCompuesto
					estados_asignacion.append(estado.obtener_conjunto_estados)
				end
			end
			inicial = false
			historico = false
			for estado in estados_asignacion
				if estado.class == EstadoHistorico
					historico = true
				end
				if (estado.class == EstadoCompuesto or estado.class == EstadoSimple)
					if estado.inicial == true
						inicial = true
						nombre_inicial = estado.nombre
					end
				end
				if (inicial == true and historico == true)
					raise Error_inicial_y_historico.new(nombre_inicial), "Error, creacion de estado historico e inicial de nombre #{nombre_inicial} \n"
				end
			end
		end
		def estados= (estados) # setter 
			errores()
			@estados = estados
		end
		def estado_final ()
			estado = EstadoFinal.new
			@estados << estado
		end
		
		def estado_simple (inicial = false, nombre)
			estado = EstadoSimple.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				@estados << estado
			end
			errores
		end

		def estado_compuesto (inicial = false, nombre, &proc)
			estado = EstadoCompuesto.new(inicial, nombre)
			if estados.include?(estado)
				raise "El nombre #{nombre} esta repetido en diferentes estados\n"
			else
				estado.instance_eval(&proc)
				@estados << estado
			end
			errores
			errores_transiciones
		end

		def estado_historico 
			for estado in @estados
				if (estado.class == EstadoHistorico)
					raise Error_mas_de_un_historico.new(@nombre), "Error, mas de un estado historico en el estado compuesto #{@nombre}\n"
				end
			end
			estado = EstadoHistorico.new
			@estados << estado
			errores
		end
		
		def obtener_conjunto_estados
			conjunto_estados = []
			for estado in @estados
				if estado.class == EstadoCompuesto
					conjunto_estados.append(estado.obtener_conjunto_estados)
				else
					conjunto_estados.append(estado)
				end 
			end
			return conjunto_estados
		end
			   
	end
	
	# Estado Historico
	class EstadoHistorico
		def to_s()
			puts "Estado historico\n"
		end
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
		attr_accessor :nombre_evento
		def eql?(other)
			if @nombre_evento != nil
				return (self.class == other.class and @nombre == other.nombre)
			end
		end
		def to_s()
			puts "Evento: #{@nombre_evento}\n"
		end
	end

	class TransicionSimple 
		def initialize (origen, destino)
			@origen = origen
			@destino = destino
			@hay_evento = false
		end
		def evento(nombre)
			@accion = Evento.new(nombre)
			@hay_evento = true
		end
		def to_s()
			puts "Transicion Origen #{@origen}\n"
			puts "Transicion Destino #{@destino}\n"
			if @hay_evento != false
				@accion.to_s
			end
		end
		attr_accessor :origen, :destino, :hay_evento, :accion
	end

	class Bifuracion 
		def initialize (origen, *destinos)
			@origen = origen
			@destino = destinos
			@hay_evento = false
		end
		def evento(nombre)
			@accion = Evento.new(nombre)
			@hay_evento = true
		end
		def to_s()
			puts "Bifurcacion Origen #{@origen}\n"
			puts "Bifurcacion Destino #{@destino}\n"
			if @hay_evento != false
				@accion.to_s
			end
		end
		attr_accessor :origen, :destino, :hay_evento, :accion
	end

	class Union 
		def initialize (destino, *origenes)
			@origen = origenes
			@destino = destino
			@hay_evento = false
		end
		def evento(nombre)
			@accion = Evento.new(nombre)
			@hay_evento = true
		end
		def to_s()
			puts "Union Origen #{@origen}\n"
			puts "Union Destino #{@destino}\n"
			if @hay_evento != false
				@accion.to_s
			end
		end
		attr_accessor :origen, :destino, :hay_evento, :accion
	end
end