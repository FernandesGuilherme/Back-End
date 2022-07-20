#Faça um programa que mostre na tela a contagem regressiva para o estouro de fogos de artificio
# indo de 10 até 0, com pausa de 1 segundo entre eles

from time import sleep
import emoji

for c in range (10,0, -1):
    print(c,  "\U0001F9E8")
    sleep(1)
print("\U0001F387", "\U0001F387", "\U0001F387", "BUUUUM!", "\U0001F386","\U0001F386","\U0001F386")