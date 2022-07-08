
# Escreva um programa que leia a velocidade de um carro 
# Se ele ultrapassar 80 km mostre uma mensagem na tela que ele foi multado
# A multa vai custar 7R$ por km ultrapassado.

velocidade = float(input("Informe a velocidade: "))
if (velocidade > 80 ):
    multa = (velocidade - 80) * 7
    print("Você foi multado em: {}R$ ".format(multa))
print("Dirija com cuido")