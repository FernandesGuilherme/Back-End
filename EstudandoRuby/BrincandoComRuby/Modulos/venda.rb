require_relative"pagamento"
require_relative"frete"

class Venda
    include Pagamento
    include FRETE
    
    PRODUTOS = {"PS3" => 900.00, "PS4" => 1600.00, "PS5" => 5000.00}
    
    def imprimir_Produtos
        puts "-- LISTA DE PRODUTOS --"
        
        PRODUTOS.each do |k,v|
        puts "#{k} -#{SIMBOLO_MOEDA} - #{v}"
        end
            puts "----------------"
    end
    
    def vender 
        puts "Bem vindo"
        puts "O que deseja comprar ?"
        
        imprimir_Produtos
        
        puts "Digite o nome do produto .."
        produto = gets.chomp
        
        puts " "
        puts "Para onde deseja enviar ?"
        imprimir_tabela_frete
        
        puts "Digite o Estado: "
        uf = gets.chomp
        
        puts "Calculando..."
        valor_final = calcular_valor_final(PRODUTOS[produto], uf)
        puts "... Você deve pagar #{SIMBOLO_MOEDA} #{valor_final}" 

        puts " "
        puts "Deseja pagar ? (S/N)"
        opcao = gets.chomp
        
        if opcao == "S"
        	 pagseguro = Pagamento::PagSeguro.new
        	 pagar(valor_final)
        else
        	puts "OK, fica para a próxima! :("     
        end
   end
end


    