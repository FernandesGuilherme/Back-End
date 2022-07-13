#Escreva um programa que leia um numero inteiro qualquer e peça para o usuario escolher qual será a base de conersão
# - 1 para binário
# - 2 para octal
# - 2 para hexadecimal 


from pydoc import doc
import re


numero = int(input("Informe um número: "))

print(""" 1 -   Binário")
2 -   Octal
3 -   Hexadecimal""")
entrada = int(input(" Escolha a base de conversão "))

if(entrada == 1 ):
    while(entrada % 2 != 0):
         print(entrada)

else:
    print("")


