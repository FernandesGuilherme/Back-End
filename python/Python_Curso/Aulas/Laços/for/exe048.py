# Faça um programa que que calcule a soma entre todos os numeros impares
# que são multiplos de três e que se encontram no intervalo de 1 até 500

soma = 0
for c in range(1,500):
    if (c % 3 == 0) :
        soma += c

print(soma)