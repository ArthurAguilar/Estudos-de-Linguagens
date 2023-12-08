from uteis.projetoCeV import *

while True:
   
    option = menuPrincipal(['Pessoas Cadastradas', 'Cadastrar Novas Pessoas',
               'Sair do Sistema'])

    if option == 1:
        title(f'[bold blue]PESSOAS CADASTRADAS'.center(50))
        print()
        linha()
        sleep(2)
    elif option == 2:
        title((f'[bold blue]CADASTRO'.center(50)))
        print()
        linha()
        sleep(2)
    elif option == 3:
        print('[red]\nSAINDO DO PROGRAMA', end='')
        for i in range(3):
            sleep(.5)
            print('[red].', end='') 
        print('\n[red]FALOOOOU!')  
        break             
    else:
        print(f'[red]Valor inválido, tente entre do número 1 ao 3!')
