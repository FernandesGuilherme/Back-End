# Faça um programa que leia o ano de nacimento de uma pessoa e informe de acordo com sua idade
# Se ainda vai se alistar no serviço militar 
# Se é hora de se alistar 
# se já passou o tempo de se alistar 
import datetime
current_time = datetime.datetime.now() 
anoAtual = current_time.year

AnoNascimento = int(input("Informe o ano em que você nasceu "))
idade = anoAtual - AnoNascimento
saldo = idade - 18

if (idade < 18):
    print("Ainda não está na hora de se alistar, faltam {} ano(s)".format(saldo))
elif(idade == 18):
    print("Está na hora de se alistar")
else:
    print("Já passou da hora de se alistar soldado, você está atrasado {} ano(s)".format(saldo))
