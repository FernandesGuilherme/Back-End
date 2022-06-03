# Crie um programa que leia um numero Reeal qualquer
# pelo teclado e mostre na tela a sua porção inteira.
# EX: Digite um número 6.127. O Númer tem a parte inteira 6

import math
numero = float(input('Digite um número: '))
print ('O número inteiro de {} tem a parte inteira {}'.format(numero, math.floor(numero)))
