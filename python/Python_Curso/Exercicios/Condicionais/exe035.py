#Escreva um programa que leia 3 entradas e valide se pode formar um triângulo 




lado = float(input("Informe a primeira entrada: "))
lado2 = float(input("Informe a segunda entrada: "))
lado3 = float(input("Informe a terceira entrada: "))

if lado < lado2 + lado3 and lado2 < lado + lado3 and lado3 < lado2 + lado:
    print("Não é possível formar um triângulo")
else:
    print(" Pode formar um triângulo")

