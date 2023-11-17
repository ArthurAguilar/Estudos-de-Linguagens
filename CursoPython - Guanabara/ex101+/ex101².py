from datetime import date
anoAtual = date.today().year


def voto(ano_nascimento):
    idade = anoAtual - ano_nascimento
    if idade < 16:
        return f'Você tem {idade} e seu voto é PROIBIDO'
    elif idade < 18 or idade > 65:
        return f'Você tem {idade} e seu voto é FACULTATIVO'
    else:
        return f'Você tem {idade} e seu voto é OBRIGATÓRIO'


print(voto(int(input('Qual ano você nasceu? '))))
