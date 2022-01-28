module FRETE
    TABELA_FRETE = {"BA" => 1.95, "SP" => 3.87, "PE" => 2.56}

    def imprimir_tabela_frete
        puts "--- TABELA DE FRETE ---"
        
        TABELA_FRETE.each do |k,v| #Chave e valor 
            puts "#{k} - #{v}"
        end
        puts "---------------"
    end
    
    def calcular_valor_final(valor_produto, uf)
        valor_produto * TABELA_FRETE[uf] #Procura dentro da constante TABELA_FRETE o valor passado por parametro de uf
    end
end
