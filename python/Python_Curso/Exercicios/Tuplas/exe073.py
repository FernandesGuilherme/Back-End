# Crie uma tupla preenchida com os 20 primeiros colocados da tabela do campeonato brasileiro
# Na ordem de colocação e depois mostre:
# A apenas os 5 primeiros
# B Os ultimos 4 colocados
# Uma lista com os times em ordem alfabética
# Em que posição na tabela está o São Paulo

menu = True
tabelaBrasileirao = ('Palmeiras',
'Corinthians',	
'Fluminense',	
'Atlético-MG',	
'Athletico-PR',
'Flamengo',	
'Internacional',	
'Red Bull Bragantino',
'Santos',	
'Botafogo',	
'São Paulo',
'Ceará',	
'Coritiba',	
'Goiás',	
'América-MG',	
'Avaí',
'Cuiabá',
'Atlético-GO',	
'Juventude',	
'Fortaleza')

while menu:
    print('#'*50)
    op = int(input(''' TABELA DO BRASILEIRÃO
    1- A apenas os 5 primeiros
    2- Os ultimos 4 colocados
    3- Uma lista com os times em ordem alfabética
    4- Em que posição na tabela está o São Paulo
    5- Ver tabela completa
    0- Sair
    Escolha -> '''))
    print('#'*50)

    if (op == 0):
        menu = False

    if(op == 1):
     for t in range (0,6):
        print(f'{t + 1}° {tabelaBrasileirao[t]}')
      
    elif (op == 2):
     for t in range (16,20):
         print(f'{t + 1}° {tabelaBrasileirao[t]}')

    elif (op == 3):
     for times in tabelaBrasileirao :
        print(sorted(tabelaBrasileirao))
        break

    elif (op == 4):
      for t in range (0,len(tabelaBrasileirao)):
       if (tabelaBrasileirao [t] == 'São Paulo'):
        print(f' O São paulo está na {t + 1}° posição \n')

    else:
      for t in range (0,len(tabelaBrasileirao)):
        print(f'{t + 1}° {tabelaBrasileirao[t]}')
print('Obirgado')
