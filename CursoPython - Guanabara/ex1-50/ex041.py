from datetime import date
anoAtual = date.today().year

anoNascimento = int(input('Ano de nascimento do Atleta: '))
idadeAtleta = anoAtual - anoNascimento
print(f'O Atleta tem {idadeAtleta} anos de idade.')

if idadeAtleta <= 9:
    print(f'Classificação: MIRIM')
elif idadeAtleta <= 14:
    print(f'Classificação: INFANTIL')
elif idadeAtleta <= 19:
    print(f'Classificação: JÚNIOR')
elif idadeAtleta <= 25:
    print(f'Classificação: SÊNIOR')
else:
    print(f'Classificação: MASTER')