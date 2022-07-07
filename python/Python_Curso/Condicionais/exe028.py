# Escreva um programa que faça o computador "pensar" em um numero inteiro de 0 a 5
# e peça para o usuario tentar descobrir qual o numero escolhido pelo computador
# O programa devera escrever na tela se o usuario  venceu ou perdeu
import random

numero = random.randint(1, 5)
nome = str(input("Informe o seu nome: ")).strip()

print("Olá, {}. Descubra qual número estou pensando...".format(nome))
numeroUsuario = int(input("Informe um número de 1 a 5: "))

if (numeroUsuario != numero):
    print("Errou, para váriar. O número que estava pensando é {} ".format(numero))
else:
    print("Acertou, vocẽ é bom ! O número que estava pensando é {} ".format(numero))
