require_relative "Dados_Conta"

class Pessoa_Fisica < Dados_Conta 

	attr_accessor :cpf
	attr_accessor :nome

	def obter_dados
		puts "informe o nome"
		@nome = gets.chomp

		puts "informe o cpf"
		@cpf = gets.chomp

		puts "informe o saldo inicial"
		@saldo = gets.chomp
	end

	def pegar_dados
		puts @nome + @cpf + @saldo
	end
end