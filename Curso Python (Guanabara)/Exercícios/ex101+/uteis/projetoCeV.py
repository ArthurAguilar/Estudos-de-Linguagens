from rich import print
from time import sleep


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

def leiaInt(mensagem):
    while True:
        try:
            valor = int(input(mensagem))
            return valor
        except ValueError:
            print('[red]Erro! Por favor, digite a idade corretamente.')


def arquivoExiste(nome):
    try:
        with open(nome, 'rt'):
            pass
    except:
        return False
    else:
        return True
    

def criarArquivo(nome):
    try:
        a = open(nome, 'wt+')
        a.close()
    except:
        print(f'Houve um erro na criação do arquivo.')
    else:
        print(f'Arquivo "{nome}" criado com sucesso.')


def lerArquivo(nome):
    try:
        with open(nome, 'rt') as arquivo:
            print(arquivo.read())            
    except:
        print(f'Erro ao ler o arquivo.')


def cadastrarPessoas(msg, nome = '<desconhecido>', idade = 0):
    try:
        with open(msg, 'at') as arquivo:
            arquivo.write(f'{nome:<30}{idade:>10}\n')

    except:
        print(f'Erro ao cadastrar')
    else:
        print(f'{nome} cadastrado com sucesso')
        arquivo.close()

