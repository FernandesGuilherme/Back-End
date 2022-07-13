# A confederação de natação precisa de um programa que leia o ano de nacimento de um atleta 
# e mostre sua categoria de acordo com sua idade

# Até 9 anos: MIRIM
# Até 14 anos: INFANTIL
# Até 19 anos: JUNIOR
# Até 20 anos: SENIOR 
# Acima: MASTER

import datetime
from time import time

anoSistema = datetime.datetime.now()
anoAtual = anoSistema.year

AnoNascimentoAtleta = int(input("Informe o ano de nascimento do atleta: "))
idadeAtleta =  anoAtual - AnoNascimentoAtleta

if (idadeAtleta <= 9 ):
    print("MIRIM")
elif (idadeAtleta > 9 and idadeAtleta <= 14):
    print("INFANTIL")
elif (idadeAtleta > 14 and idadeAtleta <= 19):
    print("JUNIOR")
elif (idadeAtleta > 19 and idadeAtleta <= 20):
    print("SÊNIOR")
else:
    print("MASTER")
