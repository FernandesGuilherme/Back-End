#Crie um programa que leia um nome e mostre o primeiro e o ultimo nome da pessoa

nome = str (input("Informe seu nome: ")).strip()
n = nome.split()

print(n[0])
print(n[len(n)-1])