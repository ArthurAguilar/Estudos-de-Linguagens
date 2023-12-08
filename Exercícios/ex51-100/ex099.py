from time import sleep
from random import randint

def maior():
    maior_numero = float('-inf')
    cont = 0
    print('Analisando os números passados...')
    for i in range(randint(1, 10)):     
        j = randint(1, 10)
        print(f'{j}', end=' ', flush=True)
        sleep(.5)
        cont += 1
        if j > maior_numero:
            maior_numero = j
    print(f'\nForam informados {cont} números ao total.')
    print(f'O maior número informado foi {maior_numero}.')
    print('-'*50)


print('-'*50)
maior()
maior()
maior()
