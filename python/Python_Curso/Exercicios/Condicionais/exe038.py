#Escreva um programa que leia dois valores inteiros e compare os dois 
# Mostre na tela uma mensagem 
# O primeiro valor é maior
# O segundo valor é maior
# Ambos são iguais

numero1 = int(input("Informe o primeiro número: "))
numero2 = int(input("Informe o segundo número : "))

if(numero1 > numero2):
    print("O primeiro número é o maior")
elif(numero2 > numero1):
    print("O segundo numero é maior")
else:
    print("Ambos os números tem o mesmo valor")