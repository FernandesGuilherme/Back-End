#Crie um programa que leia quanto dinheiro uma pessoa tem na carteira
#E mostre quantos Dólares ela pode comprar
#Considere US$ 1.00 = R$3.27

dolar = float(3.27)
dinheiro = float(input('Quanto de dinheiro você tem ? '))
if (dinheiro < dolar):
    print('Desculpe, saldo insuficiente')
else:
 total = float(dinheiro/dolar)

 print('Você consegue comprar {} dolares'.format(total))
