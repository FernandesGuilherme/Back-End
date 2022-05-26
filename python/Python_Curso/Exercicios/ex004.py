#Faça um programa que leia algo pelo teclado
#e mostre na tela seu tipo primitivo e todas
#as informações possiveis sobre ele

entrada = input('informe algo: ')

print("É do tipo:  {}".format(type(entrada)))
print('É um alfanumerico: {}'.format(entrada.isalnum()))
print('É alfabetico: {} '.format(entrada.isalpha()))
print('É um decimal: {} '.format(entrada.isdecimal()))
print('É um número:  {}'.format(entrada.isnumeric()))
print('Esta tudo em maíusculo : {} '.format(entrada.isupper()))
print('Esta tudo em minusculo : {} '.format(entrada.islower()))


