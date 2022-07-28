# Crie um jogo de par ou impar, o jogo só será encerrado quando o usuário perder
# Ao final, você deve mostrar na tela a quantidade de vezes que o usuário ganhou

import random

ganhou = True
vitoria = 0

while ganhou :
    computador = random.randint(0, 20)

    op = int (input('''1 - PAR 
2 - IMPAR
Escolha: '''))

    if (op < 1 or op > 2):
        print('Opção inválida, ', end='')
        break

    jogador = int (input('Jogue: '))
    soma = computador + jogador

    print(f'Eu joguei {computador}, você {jogador}, a soma deu {soma} ')

    if(op == 1 and soma % 2 == 0):
            print(f'O número final foi {soma} que é PAR')
            print('Você ganhou')
            vitoria+=1
            
    elif (op == 1 and soma % 2 == 1):
            print(f'Você perdeu, o número {soma} é impar')
            break
            
    elif (op == 2 and soma % 2 == 0):
            print(f'O número final foi {soma} que é PAR, você perdeu !')
            break
        
    else:
            print(f'O número final foi {soma} que é IMPAR, você ganhou !')
            vitoria+=1
    
print('Fim de jogo')
print(f'Você ganhou {vitoria} vezes de mim')