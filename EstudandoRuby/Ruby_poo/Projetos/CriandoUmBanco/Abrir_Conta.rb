require_relative "Pessoa_Fisica"
require_relative "Pessoa_Juridica"

class Abrir_Conta 

	def conta 
		pf = Pessoa_Fisica.new
		pj = Pessoa_Juridica.new
		puts "Escolha o tipo de conta"
		puts "1- Conta pessoa fisica "
		puts "2- Conta  pessoa juridica"
		op = gets.to_i

		if op == 1
			pf.obter_dados
			pf.pegar_dados
		else
			pj.testando

		end
	end
	ab = Abrir_Conta.new
	ab.conta
end