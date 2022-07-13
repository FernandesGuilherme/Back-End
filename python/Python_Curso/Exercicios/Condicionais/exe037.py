#Escreva um programa que leia um numero inteiro qualquer e peça para o usuario escolher qual será a base de conersão
# - 1 para binário
# - 2 para octal
# - 2 para hexadecimal 


from pydoc import doc
import re


numero = int(input("Informe um número: "))
print(""" Opções para conversão 
1 -   Binário")
2 -   Octal
3 -   Hexadecimal""")
entrada = int(input(" Escolha a base de conversão "))

if(entrada == 1 ):
    print(bin(entrada))
elif (entrada == 2):
    print(oct(entrada))
elif(entrada == 3):
    print(hex(entrada))
else:
    print("Opção inválida")


