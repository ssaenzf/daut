require_relative 'maquina_estados_modulo'
require_relative 'Excepciones/Error_mas_de_un_historico'
require_relative 'Excepciones/Error_estados_mismo_nombre'
require_relative 'Excepciones/Error_mas_de_un_inicial'
require_relative 'Excepciones/Error_inicial_y_historico'
require_relative 'Excepciones/Error_transiciones_elemento_mismo_evento'
require_relative 'Excepciones/Error_transiciones_elemento_contenido_mismo_evento'

# Error1 Creacion de más de un estado historico dentro de un estado compuesto
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados {
		estado_compuesto :estado_compuesto1 do
	        estado_historico
	        estado_historico
	    end
	}
rescue Error_mas_de_un_historico => error
	print error
end

# Error2 Estados con el mismo nombre
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados { 
		estado_simple :True, :estado_simple1
		estado_simple :estado_simple1
	}
rescue Error_estados_mismo_nombre => error
	print error
end

# Error3 Maquina de estados con mas de un estado inicial
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados { 
		estado_simple true, :estado_simple1
		estado_simple true, :estado_simple2
	}
rescue Error_mas_de_un_inicial => error
	print error
end
maquina_estados.to_s

# Error4 Maquina de estados con un estado inicial e historico
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados { 
		estado_compuesto :estado_compuesto1 do
	        estado_simple true, :estado_simple1
	        estado_historico
	    end
	}
rescue Error_inicial_y_historico => error
	print error
end

maquina_estados.to_s()

# Error5 Multiples transiciones desde elemento con mismo nombre de evento
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados { 
		estado_compuesto :estado_compuesto1 do
	        estado_simple true, :estado_simple1
	    end
	    estado_compuesto :estado_compuesto2 do
	        estado_simple :estado_simple2
	        estado_historico
	    end
	    estado_simple :estado_simple3
	    transicionSimple :estado_compuesto1, :estado_compuesto2 do
        	evento :accion
        end
        transicionSimple :estado_compuesto1, :estado_simple3 do
        	evento :accion
        end
	}
rescue Error_transiciones_elemento_mismo_evento => error
	print error
end

maquina_estados.to_s()

# Error6 Multiples transiciones desde elemento compuesto y elementos contenidos con el mismo nombre de evento
begin
	maquina_estados = MaquinaEstadosModulo.maquinaEstados { 
		estado_compuesto :estado_compuesto1 do
	        estado_simple true, :estado_simple1
	        transicionSimple :estado_compuesto1, :estado_simple do
        		evento :accion
        	end
        	estado_compuesto :estado_compuesto2 do
		        estado_simple :estado_simple2
		        transicionSimple :estado_compuesto2, :estado_simple2 do
        			evento :accion
        		end
	    	end
	    end
	}
rescue Error_transiciones_elemento_contenido_mismo_evento => error
	print error
end

maquina_estados.to_s()