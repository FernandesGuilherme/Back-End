class Cachorro

attr_accessor :nome
attr_reader :raca

def initialize(nome, raca)
	@nome = nome
	@raca = raca
end

def latir(frase = "Au Au!")
	puts frase
end 

end

cachorro1 = Cachorro.new("Billy" , "America Bully")
puts cachorro1.nome
puts cachorro1.raca
puts cachorro1.latir
