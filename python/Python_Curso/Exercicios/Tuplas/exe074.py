# Crie um programa que vai gerar 5 numeros aleatórios e colocar em uma tupla
# Depois disso mostre a listagem de numeros gerados
# e depois disso indique o maior e o menor valor que está na tupla

from random import randint

numeros = (randint(0,99), randint(0,99), randint(0,99), randint(0,99),randint(0,99) )

for lista in numeros :
    print (f'Os números sorteados foram:  {numeros}')
    print(f'O maior número é: {max(numeros)}')
    print(f'O menor número é: {min(numeros)}')
    break
