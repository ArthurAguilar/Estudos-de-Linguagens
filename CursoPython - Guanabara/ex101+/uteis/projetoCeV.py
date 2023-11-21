from rich import print
from time import sleep
from uteis.dados import leiaInt

def linha():
    print('-'*40)


def title(msg):
    linha()
    print(msg)
    linha()


def menuPrincipal(lista):
    title('[bold blue]MENU PRINCIPAL'.center(50))
    c = 1
    for item in lista:
        print(f'[yellow]{c} - [blue]{item}')
        c += 1
    linha()    
    while True:
        try:
            print('[bold blue]Digite sua opção: ', end='')
            n = int(input())
            return n
        except (ValueError, TypeError):
            print(f'[red]ERROR! Não é um número inteiro, tente novamente.')            

