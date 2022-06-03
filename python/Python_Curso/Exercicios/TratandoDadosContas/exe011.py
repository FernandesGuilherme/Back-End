# Faça um programa que leia a atura e a largura de uma parede em metros
# calcule a sua area e a quantidade necesária de tinta necessária para pinta-la
# Sabendo que cada litro de tinta pinta uma area de 2m

altura  = int(input('Informe a altura: '))
largura = int(input('Informe a largura: '))

area = altura * largura
litroTinta = int(2)

total = area/litroTinta
print('A area é {}M², e para pintar  necessita de {}L' .format(area, total))
