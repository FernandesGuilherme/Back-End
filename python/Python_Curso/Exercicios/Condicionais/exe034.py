# Escreva um programa que leia o salario de um funcionario
# Para salarios superiores a 1.250,00 calcule um aumento de 10%
# Para inferiosres ou iguais o aumento é de 15%

salarioFuncionario = float(input("Informe o salario do funcionario: "))
base = float(1250)
if (salarioFuncionario > base):
    print("O salario atual é de {}".format(salarioFuncionario + (salarioFuncionario * 0.10)))
else:
    print("O salario atual é de {}".format(salarioFuncionario + (salarioFuncionario * 0.15)))
