require_relative 'SistemaMultiAgenteDSL'
class SistemaMultiAgente < SistemaMultiAgenteDSL
  sistema do
    tipoAgente(:perro) do
      propiedad(:patas, :NUMBER)

      regla(:Regla1) do
        accion :asignarValor, :patas, 2
      end
    end

    tipoAgente(:hormiga) do
      propiedad(:feronoma, :NUMBER)
      propiedad(:nombre, :VARCHAR).esOpcional

      regla(:Regla1) do
        accion :asignarValor, :feronema, 2
        accion :crearAgente, :perro
        accion :moverseA, :norte, 4
        condicion :agenteA, 5
      end

      regla(:Regla2) do
        accion :asignarValor, :nombre, "hola"
        condicion :propiedadIgual, :nombre, "adios"
      end
    end
  end
end

e = SistemaMultiAgente.getSistema

puts e
