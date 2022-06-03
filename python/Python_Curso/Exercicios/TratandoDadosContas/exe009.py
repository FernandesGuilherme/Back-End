#Faça um exercicio que leia um número interio qualquer
#E imprima sua tabuada
numero = int(input('Informe um número: '))

for count in range(11):
    print('{} x {} = {}'.format(numero, count, (numero * count)))
