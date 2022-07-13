# Crie um programa que leia duas notas, e calcule a media, por fim, mostre na tela
# media abaixo de 5 REPROVADO
# media acima de 7 APROVADO
# media entre 5.0 e 6.9 RECUPERAÇÃO

nota1 = float(input("Informe a primeira nota do aluno: "))
nota2 = float(input("Informe a segunda nota do aluno: "))
media = (nota1 + nota2)/2
if(media >= 7):
    print("Nota final: {}".format(media))
    print("Aprovado")
elif (media < 5):
    print("Nota final: {}".format(media))
    print("Reprovado, burro")
else:
    print("Nota final: {}".format(media))
    print("Recuperação")