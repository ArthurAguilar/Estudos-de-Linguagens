from time import sleep

def linha():
    print('-'*50)


def maior(* num):
    cont = 0
    numeros = []
    
    while True:
        n = int(input('Digite um número: '))
        cont += 1
        numeros.append(n)
        resp = str(input('Deseja continuar? [S/N] ')).upper().split()[0]
        while resp not in 'SN':
            resp = str(input('Tente novamente. Deseja continuar? [S/N] ')).upper().split()[0]
        if resp == 'N':
            break

    linha()
    print(f'Analisando os valores passados')
    for i, j in enumerate(numeros):
        print(j, end=' ', flush=True)
        sleep(.5)
    print(f'\nForam informados {cont} valores ao todo.')
    print(f'O maior valor informado foi {max(numeros)}')
    linha()


maior()
maior()
maior()
maior()
maior()