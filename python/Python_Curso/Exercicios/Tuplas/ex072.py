# Crie um progrma que tenha uma tupla totalmente preenchida por uma contagem por extenso de zero até vinte
# Seu programa deverá ler um número pelo teclado (entre 0 e 20)
# E mostralo por extenso


numero = ('Zero','Um', 'Dois', 'Três', 'Quatro', 'Cinco', 'Seis', 'Sete', 'Oito'
, 'Nove', 'Dez', 'Onze', 'Doze', 'Trese', 'Quartorze', 'Quinze', 'Dezesseis', 'Desessete'
, 'Dezoito', 'Dezenove', 'Vinte')


numeroUsuario = int(input('Informe o número entre 0 e 20: '))

while (numeroUsuario < 0 or numeroUsuario > 20):
    numeroUsuario = int(input('Você errou a opção,tente novamente, informe um número: [0 - 20]: '))
for n in range(0,len(numero)):
    print(f'Você digitou o número {numero[numeroUsuario]}')
    break
print('Fim do programa, obrigado ! ')
