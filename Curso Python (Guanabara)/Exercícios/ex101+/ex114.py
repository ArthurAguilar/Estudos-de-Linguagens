from rich import print
from rich.panel import Panel
import urllib
import urllib.request
from time import sleep


while True:
    msg = (f'''[blue]SEJA BEM VINDO
        [red][1][white] CONTINUAR
        [red][2][white] SAIR''')
    panel = Panel(msg, title="Verificação de Sites", style="bold green", width=30)
    print(panel)

    option = int(input('O que você deseja? '))
    if option == 1:
        while True:
            try:
                site = str(input("Digite o site desejado (URL COMPLETA): "))
                urllib.request.urlopen(site)
            except:
                print(f'[red]Erro, não foi possível acessar o site!')
            else:
                print('[green]O acesso ao site está liberado!')
                break


    elif option == 2:
        print('Saindo do programa', end='')
        for count in range(3):
            print('[red].', end='')
            sleep(.5)
        break