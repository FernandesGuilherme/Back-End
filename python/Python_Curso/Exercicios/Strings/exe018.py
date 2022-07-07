# Faça um programa que leia um angulo
# qualquer e mostre na tela o valor do seno
# cosseno e tangente desse angulo

from math import sin, cos, tan,radians

angulo  = float(input('Informe o ângulo: '))
senno   = sin(radians(angulo))
cosseno = cos(radians(angulo))
tangente= tan(radians(angulo))

print ('O valor de senno é: {:.2f},\n O valor de cosseno é {:.2f}\n A tangente é {:.2f} '.format(senno, cosseno, tangente))