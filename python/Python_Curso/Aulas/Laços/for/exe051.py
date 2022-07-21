#Desenvolva um programa que leia o primeiro termo e a razao de uma PA
#No final, mostre os 10 primeiros termos dessa progressão 


termo = int(input("Informe o termo da PA: "))
razao = int(input("Informe a razão da PA: "))
decimo = termo + (10 - 1) * razao

for c in range (termo, decimo + razao, razao):
    print(c)