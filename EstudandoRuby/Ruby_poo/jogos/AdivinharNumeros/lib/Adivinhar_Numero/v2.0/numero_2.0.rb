require_relative '../v1.0'

class Numero1
	attr_reader :numero

	def initialize
		Inicializacao.inicializando
		@numero = rand(100)
	end 	
	

	def inicio #(num)
		num = -1

		while num != @numero
				puts "Informe um número de 0 a 100"
				num = gets.to_i	
			if num == @numero
				puts "Parabéns, você venceu o número está correto"
			elsif num > @numero
				puts "O número informado é maior\n"
			else
				puts "O número informado é menor\n"	
			end
		end
	end
end



