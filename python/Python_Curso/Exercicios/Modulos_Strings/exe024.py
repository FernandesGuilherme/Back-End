print("""
Crie um programa que leia o nome de uma cidade e diga se ela
começa ou não com o nome santo
-----------------------------------------------------------------""")
nomeCidade = str(input('Digite o nome da cidade: '))
print(nomeCidade)
print(nomeCidade.upper().split()[0] == "SANTO")
