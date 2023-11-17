from rich import print

def leiaDinheiro(msg):
    while True:
        entry = str(input(msg)).replace(',', '.')
        if entry.isalpha():
            print(f'[red]ERRO: {entry} é um valor inválido!')
        else:
            return float(entry)
            