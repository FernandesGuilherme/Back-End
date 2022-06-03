#Faça um programa que leia um número
#E converta para centimetros e milimetros

metros = float(input('Informe a metragem: '))
mili = int(metros * 1000)
cent = int(metros * 100)

print('O valor convertido em centimetros é: {}\nO valor convertido em milimetros é: {} '.format(cent, mili))
