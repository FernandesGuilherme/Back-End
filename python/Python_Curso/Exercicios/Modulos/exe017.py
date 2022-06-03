# Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente
# de um triângulo retângulo, calcule e mostre o comprimento da hipotenusa.
import math

catetoOposto = float(input('Informe o comprimento do cateto oposto: '))
catetoAdjacente = float(input('Informe o comprimento do cateto adjacente: '))

hipotenusa = math.sqrt(math.pow(catetoOposto, 2) + (math.pow(catetoAdjacente, 2)))
print('O valor da hipotenusa é: {}'.format(round(hipotenusa, 3)))
