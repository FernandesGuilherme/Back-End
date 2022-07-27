# Faça um programa que leia o sexo de uma pessoa
# só aceite os valores 'M' ou 'F'. Caso esteja errado
# peça a digitação novamente até ter um valor correto

sexo = ''.strip().upper()
while sexo.upper() != 'M' and sexo.upper() != 'F':
    sexo = str(input('Informe o seu sexo [F/M]: '))
print('Obrigado ')