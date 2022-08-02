# Crie um programa que leia 4 valores pelo teclado e guardeos em uma tupla, no final mostre:
# Quantas vezes apareceu o valor 9
# Em que posição foi digitado o primeiro valor 3
# Quais foram os números pares



cont = 0
tupla = ((int(input('Informe o 1° número: '))), (int(input('Informe o 2° número: '))),
(int(input('Informe o 3° número: '))), (int(input(f'Informe o 4° número: '))))  

for i in range(0, len(tupla)):
    if(tupla[i] % 2 == 0):
        print(f'O número {tupla[i]} é par')
    if(tupla[i] == 3):
        print(f'O númeor 3 apareceu primeiro na posição {i + 1}°')
        break;

qtdNove = tupla.count(9)
print(f'O valor 9 apareceu "{qtdNove}" veze(s)')


