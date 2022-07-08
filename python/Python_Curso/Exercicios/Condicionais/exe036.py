#Escreva um programa para aprovar um empréstiom bancário para a compra de uma casa. O programa vai perguntar,  
# o VALOR DA CASA, o SALÁRIO do copmrador e em QUANTOS ANOS ele vai pagar.  
#
#Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salario ou entao o emprestimo sera negado


valorCasa =  float(input("Informe o valor da casa a ser comprada: "))
salario =  float(input("Informe o seu salário: "))
anos =  int(input("Em quantos anos deseja pagar:  "))

valorPrestacao = valorCasa / anos
trintaPorCentoDosalario =  (salario * 0.30)

if(valorPrestacao > trintaPorCentoDosalario):
    print("Emprestimo negado")
    print("O valor {}  excede 30% do seu salario que é {}".format(valorPrestacao, trintaPorCentoDosalario))
else: 
    print("Emprestimo aprovado, você pagara: ")
    print("{}R$, durante {} anos".format(valorPrestacao, anos))
print(trintaPorCentoDosalario)