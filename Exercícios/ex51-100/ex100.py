from random import randint
from time import sleep

núm = []
def sorteia():
    print('Os valores sorteados foram = ', end='')
    for i in range(5):
        n = randint(1,10)
        núm.append(n)
        print(f'{n}', end=' ', flush=True)
        sleep(.5)
    print('Fim!')


def somaPar():
    sum = 0
    for i in range(len(núm)):
        if núm[i] % 2 == 0:
            sum += núm[i]
    print(f'Os valores pares somados da lista {núm} é: {sum}.')
            

sorteia()
somaPar()
