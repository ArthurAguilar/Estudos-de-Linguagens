from time import sleep
cor = {
    'padrao': '\033[m',
    'vermelho': '\033[0;30;41m',
    'verde': '\033[0;30;42m',
    'amarelo': '\033[0;30;43m',
    'azul': '\033[0;30;44m',
    'rosa': '\033[0;30;45m',
    'branco': '\033[0;30m'
    }


def titulo(msg):
    """Título do programa, com cores e linhas

    Args:
        msg (_type_):Defina qual será o título
    """
    linha = '*'*len(msg)
    print(f'{cor["verde"]}{linha}\n{msg}\n{linha}{cor["padrao"]}')


def manual():
    titulo('Systema de ajuda PyCharm')
    fb = str(input('Função ou biblioteca: '))
    titulo(f'Acessando o manual do comando "{fb}".')
    sleep(1)
    help(fb)


manual()
