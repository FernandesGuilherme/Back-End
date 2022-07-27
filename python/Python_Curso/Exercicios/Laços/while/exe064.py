# Crie um programa que leia varios numeros inteiros pelo telclado.
# O programa só vai parar quando o usuário digitar o valor 999
# que é a condição de parada.

# No final mostre quantos números foram digitados e qual foi a a soma
# entre eles (Desconsiderando a flag(999))

numero = 0
conta = 0
palpites = -1
while numero != 999:
    palpites = palpites + 1
    numero = int(input('Digite seu numero: [999 para parar]'))
    
    conta += numero 
    resultado =  conta - 999 
    
    
print('Resultado da conta do valores:  {}'.format(resultado))
print('Quantidade de números informados:  {}'.format(palpites))