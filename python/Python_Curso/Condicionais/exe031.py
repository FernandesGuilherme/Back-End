# Desenvolva um programa que pergunte a distância de uma viagem em km
# Calcule o preço da passagem cobrando 0,50 por km para viagens até 200 km
# E 0,45 para viagens mais longas
distanciaViagem = float(input("Informe a distância a ser percorrida: "))
if (distanciaViagem <= 200):
    print("O valor da viagem é de {:.2f} R$".format(distanciaViagem * 0.50))
else:
    print("O valor da viagem é de {}".format(distanciaViagem * 0.45))