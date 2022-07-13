# Desenvolva uma lógica que leia o peso e a altura de uma pessoa
# Calcule o IMC dela 
# Informe o status de acordo com o indice

# Abaixo de 18.5: Abaixo do peso
# Entre 18.5 e 25: Peso ideal
# De 25 até 30: Sobrepeso
# De 30 á 40: Obesidade
# Acima de 40 Obesidade mórbida 

peso = float(input("Informe o peso: "))
altura = float(input("Informe o altura: "))
IMC =  peso / (altura * altura)

if (IMC < 18.5):
    print("Abaixo do peso")
elif (IMC >= 18.5 and IMC <=25):
    print("Peso ideal")
elif (IMC > 25 and IMC <=30):
    print("Sobrepeso")
elif (IMC >30  and IMC <=40):
    print("Obesidade")
else:
    print("Obesidade mórbida")