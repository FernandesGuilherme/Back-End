require_relative "Dados_Conta"

class Pessoa_Juridica < Dados_Conta	
	attr_accessor :nomeFantasia
	attr_accessor :cnpj
	
	def testando
		puts "testando"
		close()
	end
end
