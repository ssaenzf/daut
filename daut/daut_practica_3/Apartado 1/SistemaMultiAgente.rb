require_relative 'SistemaMultiAgenteDSL'
class SistemaMultiAgente < SistemaMultiAgenteDSL
  sistema(:Sistema1) do
    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)
      propiedad(:patas, :VARCHAR)

      regla(:Regla1) do
        accion :asignarValor, :patas, 2
      end
    end

    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)

      regla(:Regla1) do
        accion :asignarValor, :patas, 2
      end
    end

    tipoAgente(:hormiga) do
      propiedad(:feronoma, :NUMBER)
      propiedad(:saludo, :VARCHAR).esOpcional

      regla(:Regla1) do
        accion :asignarValor, :feronom, 2
        accion :crearAgente, :perro
        accion :moverseA, :norte, 4
        accion :moverseA, :par, 4
        condicion :agenteA, :perro, 5
      end

      regla(:Regla2) do
        accion :asignarValor, :saludo, "adios"
        condicion :propiedadIgual, :saludo, "adios"
      end
    end

    agente :perro1, :perro do
      setPropiedadValor :patas, 4
    end
    agente :hormiga1, :hormiga do
      setPropiedadValor :feronoma, 4
      setPropiedadValor :saludo, "hola"
    end
    agente :hormiga2, :hormiga do
      setPropiedadValor :saludo, "hola"
    end
    agente :gato1, :gato
  end
end

s = SistemaMultiAgente.getSistema
s.to_s
