#==================================================================================#
#OPERADORES RELACIONAIS         |                   OPERADORES ARITMÈTICOS         |
# > Maior                       |                  # + Adição                      | 
# < Menor                       |                  # - Subtração                   |   
# >= Maior igual                |                  # * Multiplicação               |
# <= Menor igual                |                  # / Divisão                     |    
# == Igual                      |                  # ** Potência                   |
# != diferente                  |                  # % Modulo ou resto da divisão  |
# = Atribuição                  |                  # <=> spacechips                |            
#==================================================================================#


#VARIÀVEIS
# PARA CRIAR VARIÁVES APENAS DEVE-SE SETAR NOME E VALOR
nome = "Guilherme"
idade = 22
salario = 2.520

#CONSTANTES
#Definidas sempre em letra MAÌUSCULAS ex ROR = "Ruby on rails"
ROR = "Ruby on rails" #CONSTANTE
ror = "Ruby on rails" #VARIÀVEL


#IMPRESSÂO NA TELA
# PUTS Mostra uma mensagem na tela, semelhante ao sout 
puts "Olá mundo"; 
puts "====================="

#ARMAZENANDO ENTRADAS EM VARIÀVEIS
puts "Digite seu nome: ..."
nome = gets.chomp


#CONCATENAÇÂO
#PARA CONCATENAR DEVE USAR VIRGULA (variavel 1, variavel 2)
puts nome, idade, salario


#Operadores lógicos
=begin
 && / and -(condição E condição)   
 || / or  -(condição OU condição)
 !   -(NÂO é verdade, negação) 
=end




#METODOS RESERVADOS

#METODO .class NO INFORMA O TIPO DA VARIÀVEL
nome.class
idade.class
salario.class
puts nome.class, idade.class, salario.class
puts "====================="

#METOD .split 
str = "Pão,Leite,Café,Bolacha"
x = str.split(",") #.split separa os elementos de uma string e transforma em vetor, o elemento de separação deve estar em ("elemento") 
puts str 
puts x
puts x.inspect
puts x.class

# Guilherme, Camila, Fabiano
# Guilherme
# Camila
# Fabiano
# ["Guilherme", " Camila", " Fabiano"]
# Array


#METODO .join 
str2 = %w(guilherme fernandes lima) # %w gera um array
puts "Isso é um Join#{str2.join(",")}"

#Saida Isso é um Joinguilherme,fernandes,lima
# Sem por virgula no método -- Isso é um Joinguilhermefernandeslima


#METODO eval() 
#serve para interpretar o que é digitado ou código Ruby

puts "Digite o que quer fazer "
str = gets.chop #Se digitar 1+2 
puts str #1+2

x = eval(str) #Aqui vai interpretar
puts x #E imprimir 3



#Intance Of 
#-> Semelhante ao .class, informa a classe de uma variável
a = 123
a.class # fixnum -> numero inteiro
a.instance_of?(Array) # false
a.instance_of?(Fixnum) # true
#Bom para mostrar o tipo de entrada

#METODO .gsub 
#troca a primeira string (dentro de aspas) pela segunda, semelhante a uma subtituição *variavelComTexo.gsub("Titular", "reserva")*
text = "Ruby " + "on " + "rais" + h["a"]
puts text.gsub ("rails", "Rails") #Altera somente na hora de mostrar, se imprimir a variável texto novamente, não apresentará a troca
puts text

#Para a troca permanente com o método gsub, deve -se usa o carácter ! na frente, fazendo que a troca seja permanente. 
puts text.gsub! ("rails", "Rails")
puts text

#Overriding (Sobrescrita de Método)
class Calculadora
    def somar (n1, n2)
        n1+n2
    end
end 


class CalculadoraFeshion < Calculadora
    def somar (n1,n2) #Sobrescrita do metodo da classe pai. 
        super  #Invoca dentro da classe filha o mesmo metodo na clase pai e depois segue, pode passar parametro
        puts "A soma é #{n1 + n2}"
    end    
end

c = Calculadora.new
c.soma(3,2)

c1 = CalculadoraFeshion.new
c1.somar(3,2)


#Object_id => mostra o ID de um objeto/variável casa objeto tem um ID único 
puts nome.Object_id  


#CONVERSÂO
#GETS le e tranforma a entrada em STRING, para fins de calculo deve-se converter:
#Conversão de Strings  ex idade = gets.to_i (para Inteiro) | to_f (para Float) | to_s (String); 
nome = gets.to_i;
nome = gets.to_f


#CONDICIONAIS 
# *if DEVE ENCERAR O BLOCO COM *end -- A CONDIÇÃO NÃO NECESSÁRIAMENTE DEVE ESTAR ENTRE () -- NÃO USAR CHAVES {} 
a = 1 
b = 2

if (a < b) then #Se condição então
    puts "a é menor"
else              # se não
    puts "a é maior"
end

#unless =>  if ao contrario, onde executa o conteudo dentro da condicional caso a condição não seja verdadeira
unless a < b #A menos que
    puts "b é menor"
else
    puts "a é menor"
end


#CASE variavel WHEN condition END encerra o bloco. 
a = 1 
case a 
    when 1
          puts "a é 1"   
    else
        puts "Opção inválida"
end

#CONDICIONAL TERNARIO
#IF condição        saida se verdade           saida se falso  
(a == 3)      ?    (puts "a é tres" )    :    (puts "é diferente")


#ESTRUTURAS DE REPETIÇÃO
#WHILE *enquanto* (Fecha com end)
while a < 10
    a += 1
    puts a
end

#UNTIL (enquanto for falsi)
until (a == 0) # até que o a atinja 0
a -= 1
    puts a
end

#FOR (se lê: Para i ir de 0 a 5 faça)
for i in 0 .. 5 
    puts i
end

#EACH *para cada número do vetor faça algo*
[1,2,3,4,5].each do |j| # Pegou os elementos da lista e atribuiu ao J e imprimiu depois foi para o próximo da lista.
    puts j
end

#Times Repete um código de bloco X vezes
5.times {puts "Vai repetir na tela essa mensagem 5x"}
5.times { |x| puts "Vai repetir na tela essa mensagem 5x com contador #{x}"}


#VETORES, não precissa definir o tamnaho (v = [12]) somente declarar (v=[])
v = [1,2,3]
puts v.class #Classe do vetor 
puts v.inspect # Inspeciona os elementos do vetor
puts v # imprime V
puts v[2] # imprime V na posição dois, ou seja, 3

#Outra maneira de criar um array
a = Array.new  # Criar a variável e ussar Array.new para dizer que A é um array
a.push(36) # .push para adicionar na ultima posição a.push ("String", 1, 1.2)
  puts a

# Para apagar um elemento de dentro do Vetor
a.delete(36)

#Para sortear um número e pegar de dentro de um vetor 
v.sample #Ex: Retorna 2

#OPERADORES DE INTERVALO .. | ...   
(1...5).each do |x| puts x # de 1 a 4
(1..5).each do { |e| puts e } # de 1 a 5

# ARGV
x = ARGV #Permite na hora de executar o arquivo passar parametros na frente do nome, e irá transformar os parametros em elementos do array
  puts x

#hashes, semelhante ao vetor, mas definimos o "nome" do indice, composto por chave e valor.
h = {"a" => 123, "b" => 456}
puts h.class
puts h.inspect        #| 123 |  456 |
puts h                #  a       b

#Para incluir um novo elemento dentro de uma hash, deve se usar o metodo .merge
h.merge! ({"c" => 789})  # ! significa que estou modificando algo já pronto.

# | 123  | 456  | 789  | 
#    a      b      c


#STRINGS
#Interpolando String  ou usando a variável dentro de "" (aspas duplas) em '' (aspas simples não é possível), deve se usar #{variável}
 x = "rais"
 "ruby on #{x}" 

# + ou << (+ vai gerar um novo endereço na memória)
 puts "Ruby " + "on " + "rais" + h["a"]
 puts "Ruby " << "on " << "rais" << h["a"]


#Symbol == String imutável que serve para identificar algo
ha = {:a => "123", :b => "456" }
hb = {a: 123, :b => 456 }


#Criando Funções em Ruby, Sintaxe 
#  def nome() 
    #...#
# end 

def meu_menu  
   puts "---------------"
   puts"|----- MENU ----"
   puts"----------------"
end 

#Possivel passar valores por paramtro -- Estuda questões se é ou não necessário abrir parentses '()' 
def soma a,b
    resultado = a + b 
    puts resultado
end

#PARENTESES  EM FUNÇÔES. 
# O USO DE PARENTESE É OPCIONAL:
#OBS PARA USO DO PARENTESEES, NÂO COLOQUE ESPAÇOS NA ASSINATURA DO METODO DEPOIS DO NOME

def soma(a,b)
   puts "O resultado é #{a+b}" 
end

soma 5,7
soma(8,1)


#Ranges / intervalos 
(1..10).each do |i| # vai do 1 ao 10
    puts i
end

puts ("============")

(1...10).each do |i| # ... não mostra o ultimo elemento --> 1 ao 9
    puts i
 end

 # Classes em ruby

 # class Nome
 #  ...
 #end

 class Pessoa
    def apresente_se
        puts "Olá eu nasci de uma classe pessoa"
    end
     def qual_o_seu_numero
       puts self.object_id # self server para pegar o ID da própria intância 
    end
end
 #Formas de instânciar uma classe
#[1] pry(main)> require_relative "Pessoa.rb"
#[2] pry(main)> x = Pessoa.new
#[3] pry(main)> x.apresente_se
#Olá eu nasci de uma classe pessoa
 
#attr_accessor
# attr_accessor :nome #Permite ler e escrever a variável nome
# attr_read :nome     #Não permite nova escrita na variável, somente leitura
# attr_writer :nome   #Permite somente a escrita, não possível ler o conteudo


 class Pessoa
    attr_accessor :nome # x.nome para imprimir x.nome = "valor" para atribuir
    
    #metodo construtor
    def initialize(nome) #semelhante a um metodo contrutor, sempre que usado o metodo initialize(variavel) ao instanciar uma classe, sou obrigado a passar um valor por parametro
        @nome = nome #@nome é uma variável de intância
    end
    pessoa1 = Pessoa.new("Guilherme")

    def initialize
        @nome = "Fulano"
    end
    pessoa2 = Pessoa.new
    pessoa2.nome = "Fulano"
end

# Formas de instânciar uma classe com attr_acessor :nome getter setter
# [1] pry(main)> require_relative "Pessoa.rb"
# [2] pry(main)> x = Pessoa.new("Guilherme")
# [3] pry(main)> x
# Guilherme
# [4] pry(main)> x.nome = "Camila" 
# => "Camila"



#CLASSES E HERANÇA 
# UTILIZA-SE O SIMBOLO MENOR QUANDO UMA CLASSE É HERANÇA DE OUTRA (ClasseFilho < ClassePai)

class Pessoa 
  #Atributos e Métodos
end

require_relative"Pessoa.rb" #Semelhante ao import 
class PessoaFisica < Pessoa
#Atributos da classe pessoa
#Atributos próprios 
end


#Self  --não precisa instaciar a clase para chamar o metodo
class self.teste
    def ola 
    "Olá"
    end
end    
teste.ola


#Classe contante
class Teste1
    PI = 3.14
end

puts Teste::PI #Busca dentro da classe Teste o que é PI :: Buscar dentro de uma classe um determinado elemento



#Arquivos
File.open('Nome_Arquivo' 'w') do |f1| #Internamente f1 é como trabalho dentro do programa, abro ou crio o arquivo para escrita#
    f1.puts("Esvrevo texto no arquivo") #Escrevo dentro do arquivo.
end


File.open('Nome_Arquivo' 'r') do |f1| #Abro o arquivo somente para leitura
    while linha = f1.gets # Percorro todas as linhas 
        puts linha #Imprimo as linhas 
    end
end



#w  write (Para escrita ou criação)
#r  Read (Letura)
#


#expand_path informa um caminho, entre '' o caminho que tem que fazer para achar um arquivo a ser lido,  __FILE__ é o Local onde estou
File.open(File.expand_path('../../arquivo.txt', __FILE__,r) do |arq| # A partir do local desse aquivo, volta duas partições e pega arquivo.txt
