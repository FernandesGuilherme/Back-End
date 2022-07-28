# Crie um programa que leia a idade e o sexo de varias pessoas
# A cada pessoa cadastrada o programa deverá pergunta se o usuario quer ou não cadastrar uma nova pessoa
# No final mostre:
# Quantas pessoas tem mais de 18 anos
# Quantos homens foram cadastrados
# Quantas mulheres tem menos de 20 anos

cadastrar = 'S'
maiorDezoito = 0 
mulherMaiorDeVinte = 0
numHomens = 0

while cadastrar == "S":
    cadastrar = str(input('Deseja realizar um cadastro [S/N]: ')).strip().upper()
    if (cadastrar == 'S'):
        idade = int(input('Informe a idade: '))
        if (idade > 18) :
            maiorDezoito += 1

        sexo = str(input('Informe o sexo:  ')).upper()
        if (sexo == 'F' and idade < 20):
            mulherMaiorDeVinte += 1
        if (sexo == 'M'):
            numHomens += 1
    else:
        break

print(f'Quantas pessoas tem mais de 18 anos: {maiorDezoito}')
print(f'Quantos homens foram cadastrados:  {numHomens}')
print(f'Quantas mulheres tem menos de 20 anos: {mulherMaiorDeVinte}')