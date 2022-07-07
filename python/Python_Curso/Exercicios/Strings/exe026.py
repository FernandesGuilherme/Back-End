#Faça um programa que leia uma frase pelo teclado e mostre:

#Quantas vezes aparece a letra "o"
#Em que posição aparece a letra o a primeira vez
#Em que posição aparece a letra o a última vez


frase = input("Escreva uma frase: ").lower().strip()
print("Quantas vezes aparece a letra 'o' {} ".format(frase.count("o")))
print("Em que posição aparece a letra 'o' aparece na primeira vez {}".format(frase.find("o"), "° posicao"))
print("Em que posição aparece a letra 'o' aparece pela ultima vez {}".format(frase.rfind("o"), "° posicao"))
