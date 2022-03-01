class Libro
  def initialize(autor)
    @id = 5
    @tipo = "Western"
    @autor = autor
    @autor2 = autor # Varias variables de instancia referenciando un mismo objeto
    @subcategorias = ["Comedia", "Drama", "Belica"] # Variable de instancia de tipo array
    @protagonistas = {"El_bueno" => "Clint Eastwood", "El_feo" => "Eli Wallach"} # Variable de instancia de tipo hash
  end
  attr_accessor :id, :tipo, :autor, :autor2, :subcategorias, :protagonistas

  def to_s
    puts "Libro: id #{@id}, tipo #{@tipo}, autor #{@autor} autor2 #{@autor2} subcategorias #{@subcategorias.to_s} protagonistas #{@protagonistas.to_s}\n Autor: #{@autor.nombre}"
  end
end