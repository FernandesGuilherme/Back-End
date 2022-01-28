class Numero
	attr_reader :numero

def initialize
		@numero = rand(100)
end 	

	def inicio #(num)
		num = -1
		#puts @numero
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

=begin
jogo = Numero.new
jogo.inicio



	
until jogo.inicio do
	puts "Informe um número de 0 a 100"
	num = gets.to_i
	jogo.inicio(num)
=end



