# Crie um programa que tenha uma tupla única com nome de produtos e seus respectivos preços, na sequência
# No final mostre a listagem de preços organizando de forma tabular.

produtos=('Lápis', 1.75, 'Borracha', 2.00, 'Caderno', 15.90, "Estojo", 25.00, "Transferidor", 4.20,"Compasso", 9.99
,"Mochila",120.32, "Caneta", 22.30,"Livro",34.90)

print('-'*40)
print('          LISTAGEM DE PREÇOS')
print('-'*40)

for i in range (0, len(produtos)): 
        if(i % 2 == 0):
            print(f'{produtos[i]}','  ', end='' )
        
        elif i % 2 == 1:
             print(f'\t{produtos[i]} R$')
print('-'*40)