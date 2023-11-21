from rich import print


def leiaInt():
    while True:
        try:
            n = int(input('Digite um número inteiro: '))
            return n
        except ValueError:
            print(f'[red]ERROR! Não é um número inteiro, tente novamente.')            


def leiaFloat():
    while True:
        try:
            n = float(input('Digite um número real: '))
            return n
        except (ValueError, TypeError):
            print(f'[red]ERROR! Não é um número real, tente novamente.')


valorInteiro = leiaInt()
valorReal = leiaFloat()
print(f'[blue]O valor inteiro digitado foi {valorInteiro} e o real foi {valorReal}.')
