require_relative '../Excepciones/Error_Distancias'
class CondicionAgenteA
  def initialize(tipo, distancia)
    @tipo = tipo
    if distancia.instance_of?(Integer) == false
      raise Error_Distancias.new, "El valor #{distancia} no es correcto para indicar unidades de distancia\n"
    end
    @distancia = distancia
  end

  def to_s
    puts "\tTipo: #{@tipo}. Distancia: #{@distancia}"
  end
end
