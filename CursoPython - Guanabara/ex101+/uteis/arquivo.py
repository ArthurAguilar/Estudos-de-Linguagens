"""from uteis.projetoCeV import *
from uteis.dados import leiaInt


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
        

def cadastrarPessoas(msg, nome='<desconhecido>', idade=0):
    try:
        with open(msg, 'a') as arquivo:
            if nome == '<desconhecido>':
                nome = input('Nome: ')
            if idade == 0:
                idade = leiaInt(input('Idade: '))
            
            arquivo.write(f'{nome} - {idade}\n')
    except Exception as e:
        print(f'Erro ao cadastrar: {e}')
    else:
        print(f'{nome} cadastrado com sucesso.')"""












"""def lerArquivo(nome):
    try:
        a = open(nome, 'rt')
    except:
        print(f'Erro ao ler o arquivo!')
    else:
        print(a.read())"""
