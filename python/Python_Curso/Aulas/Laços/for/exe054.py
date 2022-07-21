#  Crie um programa que leia o ano de nascimento de sete pessoas. 
# No final, mostre quantas pessoas ainda não atingiram a maioridade e quantas já são maiores.

anoAtual = 2022
maiorIdade = 0
menorIdade= 0
for c in range (0,8):
    anoNascimento = int(input('Informe o seu ano de nascimento: '))
    if(anoAtual - anoNascimento > 21):
        maiorIdade +=1
    else:
       menorIdade  +=1
print('{} pessoas atingiram a maior idade'.format(maiorIdade))
print('{} pessoas não atingiram a maior idade'.format(menorIdade))

