# Faça um programa que mostre a tabuada de vários números, um de cada vez ! 
# para cada número informado pelo usuario
# O programa deve ser interrompido quando o número for negativo 

while True:
    n = int(input('Digite um número que mostraremos a tabuada:'))
    if (n < 0) :
        break 
    for i in range (0, 11):
        print(f'{n} x {i} = {n * i}')
print('')