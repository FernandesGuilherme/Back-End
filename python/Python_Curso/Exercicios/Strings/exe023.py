from calendar import c
from re import M, U
from this import d


print("""
Faça um programa que leia um número de 0 a 9999 e mostre na tela
cada um dos digitos separados. EX: 1934
unidade: 4
dezena: 3
centena:8
milhar:1
--------------------------------------------------------------------""")
numero = int(input('Digite um número: '))
u = numero // 1 % 10 
d = numero // 10 % 10
c = numero // 100 % 10
m = numero // 1000 % 10

print(u)
print(d)
print(c)
print(m)
