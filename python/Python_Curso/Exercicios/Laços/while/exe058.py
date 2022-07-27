# Melhore o jogo do desafio 028.
# onde diz que o computador deve pensar em um numero entre 0 e 10
# Só que agora o jogador vai tentar adivinhar até acertar.
# Mostre na tela quantos palpites foram feitos até ele acertar
import random

numeroComputador = random.randint(0,10)
palpites = 1

numeroUsuario = int(input('Advinhe qual o numero que estou pensando: '))

while  numeroUsuario  != numeroComputador :
    palpites = palpites + 1
    numeroUsuario = int(input('Errou, tente de novo ! : '))

print("Parabéns, você conseguiu")
print("Total de tentativas {}".format(palpites))