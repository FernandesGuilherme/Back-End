# Crie um programa que leia varios numeros inteiros pelo teclado
# No final da execução, mostre a media entre todos eles, qual foi o maior e o menor
# O programa deve perguntar ao usuario se ele quer ou não continuar a 
# digitar valores 
media = 0
palpites = 0
n = []
seguir = True

print('Bem vindo')
print('#'*40)

while seguir:
    palpites = palpites + 1
    numero = int(input('Digite seu numero: '))
    media += numero
    n.append(numero)

    continuar = str(input('Deseja informar números ? [S/N]: ')).upper().strip()
    if (continuar == 'N'):
        seguir = False    

print('O maior número é {}, e o menor número é {} '.format(max(n), min(n)))
print("A média dos números é {:.2f}".format(media/palpites))