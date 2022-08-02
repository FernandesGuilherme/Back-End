# Crie um programa que tenha uma tupla
# com várias palavras (Não usar acento).
# depois disso vc deve mostrar para cada palavra quais são as vogais  

palavras = ('Ateu', 'Relatividade', 'Entorpecido'
, 'Semanas', 'Assassinato', 'Levedura', 'Dipstick', 
'Voar', 'Livraria', 'Silhueta', 'Tio', 'Cercado', 'Rastejar',
'Grampeador','Cercado','Movimento','Pneus','Zarabatana')  

for i in range(0, len(palavras)):
    if 'a' in palavras[i]:
        print(f'A palavra {palavras[i]} tem a')
    if 'e' in palavras[i]:
        print(f'A palavra {palavras[i]} tem e')
    if 'i' in palavras[i]:
        print(f'A palavra {palavras[i]} tem i')
    if 'o' in palavras[i]:
        print(f'A palavra {palavras[i]} tem o')
    if 'u' in palavras[i]:
        print(f'A palavra {palavras[i]} tem u')
    else:
        print('')