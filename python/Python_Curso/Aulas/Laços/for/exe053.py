#Crie um programa que leia uma frase qualquer e diga se ela é um palindromo
#Desconsidere os espaços

frase = str(input ("diga uma frase: ")).strip()
novaFrase = ""
for c in range (len(frase) -1, 0 -1, -1):
