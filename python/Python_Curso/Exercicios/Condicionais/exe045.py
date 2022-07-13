# Faça um programa que faça o computador jogar jokenpô com você


import random


print("1- Pedra")
print("2- Papel")
print("3-Tesoura")
opcaoUsuario = int(input("Escolha: "))
opcaoMaquina = random.randint(1, 3)

print(opcaoUsuario)
print(opcaoMaquina)

if(opcaoUsuario == opcaoMaquina ):
    print("Ops! parece que o jogo empatou")
elif(opcaoUsuario == 1 and opcaoMaquina == 2):
    print("Você perdeu, eu escolhi Papel ")
elif(opcaoUsuario == 2 and opcaoMaquina == 3):
    print("Você perdeu, eu escolhi tesoura ")
elif(opcaoUsuario == 3 and opcaoMaquina == 1):
    print("Você perdeu, eu escolhi pedra ")
else:
    print("Droga! Parabésn, você ganhou essa...")