# crie um programa que leia o NOME e o PREÇO de vários produros
# O programa deverá perguntar se o usuário vai continuar. No final, mostre :
# Qual o total gasto na compra
# Quantos produtos custam mais de R$1000
# Qual o nome do produto mais barato

continuar = True
somaProduto = 0
qtdMenorQueMil = 0
menor = 0
nomeProd = ''
while continuar :
    nome = str(input('Informe o nome do produto: ')).strip().upper()
    valor = float(input('Informe o preço do produto: '))
    somaProduto += valor

    if (valor > 1000):
        qtdMenorQueMil += 1

    novo = str(input('Deseja cadastrar novo produto ? [S/N] ')).strip().upper()
    
    if(valor < menor):
        menor = valor
        nomeProd = nome

    if (novo == "N"):
     break;

print(f'Qual o total gasto na compra {somaProduto}')
print(f'Quantos produtos custam mais de R$1000:  {qtdMenorQueMil}')
print(f'Qual o nome do produto mais barato:  {nomeProd}')