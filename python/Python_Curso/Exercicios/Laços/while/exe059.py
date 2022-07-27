#Crie um rprograma que leia 2 valores e mostre um menu na tela
# 1 somar 
# ..
# 5 sair 
# Seu programa deve mostrar na tela o resultado da operação solicitada. 

from math import factorial


numero =  float(input('Informe o primeiro numero: '))
numero2 = float(input('Informe o segundo numero: '))


opcao = 0
while  opcao != 5:
    opcao = int(input("""
        [1] Somar
        [2] Multiplicar
        [3] Maior
        [4] Novos números
        [5] Sair
        Escolha :  """
        
    ))

    if (opcao == 1):
        print('O resultado é {}'.format(numero + numero2))
        
    elif (opcao == 2) :
        print('O resultado é {}'.format(numero * numero2))

    elif (opcao == 3):
        if(numero > numero2):
            print('O número {} é o maior'.format(numero))
        else:
            print('O número {} é o maior'.format(numero2))
            
    elif (opcao == 4): 
        numero =  float(input('Informe o primeiro numero: '))
        numero2 = float(input('Informe o segundo numero: '))
    else:
        print ('Opção inválida, tente novamente ! ')
print('Obrigado')