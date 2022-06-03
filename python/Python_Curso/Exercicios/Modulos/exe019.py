# Um professor quer realizar um sorteio para definir quem irá apagar o quadro
# Faça um exercicio que leia o nome de 4 alunos e no fim sorteie o nome de um deles

from random import choice
from time import sleep

aluno1 = input('Nome do 1° aluno: ')
aluno2 = input('Nome do 2° aluno: ') 
aluno3 = input('Nome do 3° aluno: ')
aluno4 = input('Nome do 4° aluno: ')

lista = [aluno1, aluno2, aluno3, aluno4]
sorteador = choice (lista)

print('')
print("Iniciando sorteio.")
sleep(1)
print("Iniciando sorteio..")
sleep(1)
print("Iniciando sorteio...")
sleep(1)
print("O aluno sorteado é: ")
sleep(3)

print('O nome do aluno sorteado é {}'.format(sorteador))