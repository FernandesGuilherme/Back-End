# Faça um programa que leia 3 números e mostre o maior entre eles
# e mostre o menor

numero1 = int(input("Informe o primeiro numero "))
numero2 = int(input("Informe o segundo numero "))
numero3 = int(input("Informe o terceiro numero "))

print("")

if (numero1 > numero2 and numero1 > numero3):
    maior = numero1
    if(numero2 > numero3):
        menor = numero3
    print("O maior é o {}".format(maior))
    print("O menor é o {}".format(menor))

if (numero1 > numero2 and  numero1 < numero3):
    maior = numero3
    menor = numero2
    print("O maior é {}".format(maior))
    print("O menor é o {}".format(menor))

if(numero2 > numero1 and numero2 > numero3):
    maior = numero2
    print("O maior é {}".format(maior))
    if(numero3 < numero1):
        menor = numero1
    print("O menor é o {}".format(menor))

if (numero1 > numero2 and numero2 < numero3):
    maior = numero3
    menor = numero2
    print("O maior é {}".format(maior))
    print("O menor é o {}".format(menor))

if (numero1 < numero2 and numero2 < numero3):
    maior = numero3
    menor = numero1
    print("O maior é {}".format(maior))
    print("O menor é o {}".format(menor))
else:
    print ("")


