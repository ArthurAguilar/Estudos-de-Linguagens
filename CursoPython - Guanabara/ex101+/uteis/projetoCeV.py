from rich import print
from time import sleep

def linha():
    print('-'*40)


def menuPrincipal():
    linha()
    print('[bold blue]MENU PRINCIPAL'.center(50))
    linha()
    print('''[yellow][1] - [blue]Ver pessoas cadastradas
[yellow][2] - [blue]Cadastrar novas pessoas
[yellow][3] - [blue]Sair do sistema''')
    linha()
    
    while True:
        print('[bold blue]Digite sua opção: ', end='')
        try: 
            option = int(input())
            if option == 1:
                linha()
                print(f'[bold blue]PESSOAS CADASTRADAS'.center(50))
                linha()
                print()
                linha()
            elif option == 2:
                linha()
                print(f'[bold blue]CADASTRO'.center(50))
                linha()
                print()
                linha()
            elif option == 3:
                print('[red]\nSAINDO DO PROGRAMA', end='')
                for i in range(3):
                    sleep(.5)
                    print('[red].', end='') 
                print('\n[red]FALOOOOU!')               
                break
            else:
                print('[red]Valor inválido, tente entre do número 1 ao 3!')
        except:
                print(f'[red]Valor inválido, tente novamente!')
