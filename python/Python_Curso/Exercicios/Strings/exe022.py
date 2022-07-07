print("""\nCrie um programa que leia o nome completo de uma pessoa e mostre:
O nome com todas as letras maíusculas
O nome com todas minuscula
Quantas letras ao total sem considerar espaços
Quantas letra tem o primeiro nome\n
-------------------------------------------------------------------------------""")

nome = str(input('Digite o seu nome: '))
print('Maísuculo: {} '.format(nome.upper()))
print('Minúsculo: {} '.format(nome.lower()))
print('Total sem espaços: {} letras '.format(len(nome.strip().replace(" ", ""))))
print('Total do primeiro nome: {} letras '.format(len(nome.split()[0])))

