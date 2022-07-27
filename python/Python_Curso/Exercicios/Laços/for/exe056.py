# Exercício Python 56: 
# Desenvolva um programa que leia o nome, idade e sexo de 4 pessoas. 
# No final do programa, mostre: 
# a média de idade do grupo;
# qual é o nome do homem mais velho;
# e quantas mulheres têm menos de 20 anos.

media = 0
contFeminino = 0
nomeMaisVelho=''
for c in range (0,4):
    nome  =  str(input('Informe o seu nome:   ')).strip().upper()
    idade =  int(input('Informe a sua idade:  ')) 
    sexo  =  str(input('Informe o seu sexo: '  )).strip().upper() 
    print('='*40)

    media += idade / 4

    if  (sexo == 'FEMININO' or sexo == 'F'):
        contFeminino += 1
    if(c == 1 and sexo in "MASCULINO" or sexo in 'M' ):
        maiorIdade = idade
        nomeMaisVelho = nome
    if(sexo in 'MASCULINO' or sexo in 'M' and idade > maiorIdade):
        maiorIdade = idade
        nomeMaisVelho = nome

print('A média das idades é {}'.format(media))
print('O número de mulheres é {}'.format(contFeminino))
print('O nome do homem mais velho é {}'.format(nomeMaisVelho))

