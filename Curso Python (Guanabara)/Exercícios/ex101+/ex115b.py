from uteis.projetoCeV import *


arq = 'cursoemvideo.txt'
if arquivoExiste(arq):
    print(f'Arquivo "{arq}" encontrado com sucesso')
else:
    criarArquivo(arq)    


while True:
   
    option = menuPrincipal(['Pessoas Cadastradas', 'Cadastrar Novas Pessoas',
               'Sair do Sistema'])

    if option == 1:
        title(f'[bold blue]PESSOAS CADASTRADAS'.center(50))
        lerArquivo(arq)
        print()
        linha()
        sleep(1)
    elif option == 2:
        title((f'[bold blue]CADASTRO [00 para cancelar]'.center(50)))
        while True:
            nome = input('Nome: ')
            if nome == '00':
                break
            else:
                idade = leiaInt('Idade: ')
                cadastrarPessoas(arq, nome, idade)
                linha()
        sleep(1)
    elif option == 3:
        print('[red]\nSAINDO DO PROGRAMA', end='')
        for i in range(3):
            sleep(.5)
            print('[red].', end='') 
        print('\n[red]FALOOOOU!')  
        break             
    else:
        print(f'[red]Valor inválido, tente entre do número 1 ao 3!')
