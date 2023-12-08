from rich import print

def leiaDinheiro(msg):
    while True:
        entry = str(input(msg)).replace(',', '.')
        if entry.isalpha():
            print(f'[red]ERRO: {entry} é um valor inválido!')
        else:
            return float(entry)
    
def leiaInt():
    while True:    
        n = input('Digite um número inteiro: ')
        if not n:
            print(f'[red]ERROR! Não é um número inteiro, tente novamente.')
        else:
            if n.isnumeric():
                return n
            
def leiaFloat():
    while True:
        n = input('Digite um número: ')
        if not n:
            print(f'[red]ERROR! Não é um número real, tente novamente.')
            

                