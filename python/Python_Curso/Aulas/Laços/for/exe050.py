# Desenvolva um programa que leia seis numeros e mostre a soma apenas daqueles que 
# forem pares. Se o valor  digitado for impar desconsidere;

somaPares = 0
for c in range(1,7):
    numero = int(input("Informe um número: ")) 
    if numero % 2 == 0:
        somaPares += numero
    elif  numero % 2 == 0:
        somaPares -= numero

print("Soma dos pares: {}".format(somaPares))
