# Faça um algoritimo que leia o salario de um funcionário e mostre
# seu novo salario com um aumento de 15%

valorSalario = float(input('Informe o valor do salario: '))
valorFinal = valorSalario + (valorSalario * 0.15)
print('O valor com aumento de 15% fica: {}'.format(valorFinal))
