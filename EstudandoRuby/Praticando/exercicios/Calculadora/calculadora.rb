class Calculadora
  
  puts "CALCULADORA"
  puts  

  def somar
    puts "Informe o primeiro numero"
    numero1 = gets.to_i
      
    puts "Informe o segundo numero"
    numero2 = gets.to_i

    puts "Qual a operação: "
    puts "1- Soma"
    puts "2- Divisão"
    puts "3- Multiplicação"
    puts "4- Subtração"
    escolha = gets.to_i

    if escolha == 1
      puts "Resultado: #{numero1 + numero2}"
    end
      if escolha == 2
      puts "Resultado: #{numero1 / numero2}"
    end
    if escolha == 3
      puts "Resultado: #{numero1 * numero2}"
    end
    if escolha == 4
      puts "Resultado: #{numero1 - numero2}" 
    end
  end
end
calc = Calculadora.new
calc.somar



           

