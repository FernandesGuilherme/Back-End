#  Faça um programa que leia uma frase pelo teclado e mostre
#Quantas vezes aparece a letra "o"
#Em que posição aparece a letra o a primeira vez

frase = input("Escreva uma frase: ").lower()
print(frase)
print("Quantas vezes aparece a letra 'o' {} ".format(frase.count("o")))
print("Em que posição aparece a letra 'o' aparece na primeira vez {}".format(frase.find("o"), "° posicao"))
