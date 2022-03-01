class Registro
  def initialize
    @campos = Hash.new
  end

  def addCampo(clave, valor)
    @campos[clave] = valor
  end

  def to_s
    if @campos.size > 0
      @campos.to_s
    else
      "Ningún campo añadido"
    end
  end
  attr_reader :campos
end
