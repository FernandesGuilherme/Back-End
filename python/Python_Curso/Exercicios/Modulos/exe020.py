# O mesmo professor do desafio anterior quer sortear
# a ordem de apresentação de trabalhos dos alunos
# Faça um programa que leia o nome dos quatro alunos
# e mostre a ordem sorteada
# 
from random import shuffle, random


aluno1 = input('Nome do 1° aluno: ')
aluno2 = input('Nome do 2° aluno: ') 
aluno3 = input('Nome do 3° aluno: ')
aluno4 = input('Nome do 4° aluno: ')

lista = [aluno1, aluno2, aluno3, aluno4]
shuffle(lista) #Método para embaralhar elementos dew uma lista

print('A ordem de apresentação será: {}'.format(lista))
