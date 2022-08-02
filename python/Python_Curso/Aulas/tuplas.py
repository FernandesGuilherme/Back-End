lanche = ('Hamburguer', 'Suco', 'Pizza', 'Pudim')
print(lanche)
print(lanche[1])
print(lanche[-2])
print(lanche[1:3])
print(lanche[1:])
print(lanche[:2], '\n')
print('#'*40)

for comida in lanche:
    print(comida)

print('#'*40)

for cont in range(0, len(lanche)):
    print(lanche[cont])