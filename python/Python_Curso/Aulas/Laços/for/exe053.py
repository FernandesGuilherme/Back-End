#Crie um programa que leia uma frase qualquer e diga se ela é um palindromo
#Desconsidere os espaços


frase = str(input("Digite uma frase: ")).strip().upper()

palavras = frase.split()
junto = ''.join(palavras)
inverso = ''

for letra in range (len(junto) - 1, -1, -1):
    inverso += junto[letra]
if (frase == inverso):
    print('A palavra {} é um palíndromo'.format(frase))
else:
    print(('A palavra {} não é um palíndromo'.format(frase)))



