require_relative 'SistemaMultiAgenteDSL'
class SistemaMultiAgente < SistemaMultiAgenteDSL
  sistema(:Sistema1) do
    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)
      propiedad(:patas, :VARCHAR)

      regla(:Regla1) do
        accionMoverseNorte 6
        accionAsignarValor :patas, 3
        condicionAgenteA :hormiga, 2
      end
    end

    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)

      regla(:Regla1) do
        accionAsignarValor :patas, 3
      end
    end

    tipoAgente(:hormiga) do
      propiedad(:feronoma, :NUMBER)
      propiedad(:saludo, :VARCHAR).esOpcional

      regla(:Regla1) do
        accionSumarValor :feronoma, 3
        accionRestarValor :saludo, "hola"
      end

      regla(:Regla2) do
        accionCrearAgente :perrox, :perro do
          addValorPropiedad :patas, 5
        end
        accionCrearAgente :hx, :hormiga do
          addValorPropiedad :patas, 5
        end
        accionRestarValor :feronoma, 3
        condicionPropiedadIgual :feronoma, 6
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
