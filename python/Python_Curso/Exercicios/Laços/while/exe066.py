# Crie um programa que leia varios numeros inteiros pelo teclado
# O programa só vai parar quando o usuario digitar 999
# No final mostre quantos numeros foi digitado 
# E qual foi a soma entre eles 
# Desconsidere a flag(999)

palpites = -1
soma = 0
while True:
    n = int(input('Digite um número: [999 para parar]'))
    palpites += 1
    if (n == 999):
        break

    soma += n
print(f'A soma dos números é: {soma} e foram digitados {palpites} números')