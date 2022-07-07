print("""
CRIE UM  PROGRAMA QUE LEIA O NOME DE UMA PESSOA E DIGA SE ELA
TE 'SILVA' NO NOME
----------------------------------------------------------------""")
nome = str(input('Digite o seu nome: '))
verifica = nome.find("SILVA")

print(nome)
print(verifica == 0)
