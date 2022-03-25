require_relative 'SistemaMultiAgenteDSL'
class SistemaMultiAgente < SistemaMultiAgenteDSL
  sistema(:Sistema1) do
    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)
      propiedad("patas", :VARCHAR) # Error, propiedad ya existe

      regla(:Regla1) do
        accionMoverseNorte 6
        accionSumarValor :patas, 2
        condicionAgenteA :perro, 2
      end

      regla(:Regla2) do
        accionMoverseEste 1
        accionAsignarValor :patas, 6
        condicionPropiedadIgual :patas, 2
      end

      regla(:Regla3) do
        accionMoverseAleatorio 3
        accionRestarValor :patas, 2
        condicionPropiedadMayor :patas, 2
      end

    end

    tipoAgente(:perro) do # Error, tipo agente ya existe
      propiedad(:patas, :NUMBER)
    end

    tipoAgente(:hormiga) do
      propiedad(:feronoma, :NUMBER)
      propiedad(:saludo, :VARCHAR).esOpcional

      regla(:Regla1) do
        accionSumarValor :feronoma, 2
        accionRestarValor :saludo, "hola" # Error, resta de un dato string
      end

      regla(:Regla2) do
        accionCrearAgente :perro do
          addValorPropiedad :patas, 5
        end
        accionCrearAgente :hormiga do # Error, la propiedad patas no existe para hormiga
          addValorPropiedad :patas, 4
          addValorPropiedad :feronoma, 4
        end
        accionRestarValor :feronoma, 3
        condicionPropiedadIgual :feronoma, 2
      end
    end

    agente :perro1, :perro do
      setPropiedadValor :patas, 4
    end

    agente :perro2, :perro do
      setPropiedadValor :patas, 2
    end

    agente :hormiga1, :hormiga do
      setPropiedadValor :feronoma, 2
      setPropiedadValor :saludo, :hola
    end

    agente :hormiga2, :hormiga do # Error, no se ha asignado valor a todas la propiedades obligatorias
      setPropiedadValor :saludo, "hola"

    end
    agente :hormiga1, :hormiga do # Error, agente ya existe
      setPropiedadValor :feronoma, 4
      setPropiedadValor :saludo, "hola"
    end
    agente :gato1, :gato # Error, tipo gato no existe
  end
end

puts "\n************* SISTEMA MULTI-AGENTE *************"
SistemaMultiAgente.mostrar

puts "\n"
SistemaMultiAgente.simular(1, 4) # Error, tamaño insuficiente
SistemaMultiAgente.simular(4, 0) # Error, pasos insuficientes

puts "\n************* SIMULACIÓN *************"
SistemaMultiAgente.simular(4, 4)
