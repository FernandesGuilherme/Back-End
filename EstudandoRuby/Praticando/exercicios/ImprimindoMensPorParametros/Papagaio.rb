class Papagaio 
attr_accessor :nome
attr_accessor :idade

def initialize(nome,idade)
	@nome = nome
	@idade = idade
end  

def repetir_frase(frase = "curupaco")
	puts "#{frase}"
end
end

papagaio1 = Papagaio.new("Louro", 55)
puts papagaio1.nome
puts  papagaio1.idade
papagaio1.repetir_frase("Louro quer biscoito")