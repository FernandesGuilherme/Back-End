#Faça um programa que calcule se um ano é bissexto

ano = int(input("Informe o ano: "))
if (( ano % 4 == 0 and ano % 100 != 0 ) or (ano % 400 == 0)):
    print("Ano é Bissexto")
else:
    print("O ano não é Bissexto")