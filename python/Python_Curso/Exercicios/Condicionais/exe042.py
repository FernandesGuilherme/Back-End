# REFAÇA O DESAFIO 035
# E mostre com base nas entradas, que tipo de triângulo será formado

# Equilatero: Todos os lados iguais
# Isóceles: Dois lados iguais 
# Escaleno: Todos os lados diferentes

lado = float(input("Informe a primeira entrada: "))
lado2 = float(input("Informe a segunda entrada: "))
lado3 = float(input("Informe a terceira entrada: "))

if (lado == lado2 and lado == lado3 and lado3 == lado2):
    print("Equilatero")
elif(lado == lado2 or lado == lado3 or lado3 == lado2):
    print("Isóceles")
else:
    print("Escaleno")