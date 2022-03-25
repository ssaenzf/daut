require_relative 'maquina_estados_modulo'

maquina_estados = MaquinaEstadosModulo.maquinaEstados {
    estado_simple :True, :Disponible
    estado_simple :enMantenimiento
    estado_compuesto :Seleccion do
        estado_simple :True, :EsperandoSeleccion
        estado_simple :SeleccionBebida
        estado_simple :SeleccionDulzor
        estado_simple :SeleccionCompleta
        bifuracion :EsperandoSeleccion, :SeleccionBebida, :SeleccionDulzor
        union :SeleccionCompleta, :SeleccionBebida, :SeleccionDulzor do
            evento :seleccionar
        end
        transicionSimple :SeleccionCompleta, :Disponible do
            evento :pagar
        end
    end
    estado_compuesto :Configuracion do
        estado_simple :ConSonido
        estado_simple :SinSonido
        estado_historico
        transicionSimple :historico, :ConSonido
        transicionSimple :ConSonido, :SinSonido do
            evento :cambiar
        end
        transicionSimple :SinSonido, :ConSonido do
            evento :cambiar
        end
        transicionSimple :Disponible, :historico 
    end
    transicionSimple :Disponible, :EnMantenimiento do
        evento :mantener
    end
    transicionSimple :Disponible, :Seleccion do
        evento :comprar
    end
    transicionSimple :EnMantenimiento, :Disponible do
        evento :arreglar
    end
    transicionSimple :EnMantenimiento, :final do
        evento :retirar
    end
    transicionSimple :Seleccion, :Disponible do
        evento :cancelar
    end
    transicionSimple :Configuracion, :Disponible do
        evento :terminar
    end
}

maquina_estados.to_s

File.open("maquina_estados.txt", "w") do |file|
	maquina_estados.plant_uml(file)
end

