from datetime import date
anoAtual = date.today().year


def voto(ano_nascimento):
    idade = anoAtual - ano_nascimento
    print(f'Você tem {idade} anos e o seu voto é ', end='')
    if idade < 16:
        print('NEGADO!')
    elif idade < 18 or idade > 65:
        print('facultativo!')
    else:
        print('obrigatório!')


voto(int(input('Qual ano você nasceu? ')))
