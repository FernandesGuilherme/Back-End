# Refaça o desafio 09, mostrando na tela a tabuada que o usuarui escolheu só que agora usando o laço for 
numero = int(input('Informe um número: '))

for count in range(11):
    print('{} x {} = {}'.format(numero, count, (numero * count)))