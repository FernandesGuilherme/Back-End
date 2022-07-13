# Elabore um programa que calcule o valor a ser pago por um produto, considerando seu preço normal e condição de pagamento
# A vista dinheiro / cheque -> 10% de desconto 
# A vista no cartão -> 5% de desconto 
# Em até 2 vezes preço normal
# Em 3x ou mais -> 20% de juros
# 

valorProduto = float(input("Informe o valor no produto: "))
print("Modo de pagamento: ")

print("1 - Pagamento a vista dinheiro/cheque ")
print("2 - Pagamento a vista no cartão ")
print("3 - Pagamento em 2x ")
print("4 - Pagamento em 3x ou mais ")
modoPagamento = int(input("Informe: "))

if (modoPagamento == 1):
    valorFinal = valorProduto - (valorProduto * 0.10)
    print("Valor final com desconto por pagamento a vista é de: R${}".format(valorFinal))
elif (modoPagamento == 2):
    valorFinal = valorProduto - (valorProduto * 0.05)
    print("Valor final com desconto por pagamento a vista é de: R${}".format(valorFinal))    
elif (modoPagamento == 3):
    valorParcelado = valorProduto / 2
    print("Valor final para pagamento em até 2x  : R${} com 2 parcelas de R${} ".format(valorProduto, valorParcelado))
else:
    valorFinal = valorProduto + (valorProduto * 0.20)
    print("Valor final com acrescimo de 20% de juros é de: R${}".format(valorFinal))