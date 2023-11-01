from random import randint

sorteio = (randint(1, 10), randint(1, 10), randint(1, 10)
           , randint(1, 10), randint(1, 10))

print(f'Os valores sorteados foram: ', end=' ')
for i in sorteio:
    print(f'{i}', end=' ')
print(f'\nO maior valor foi {max(sorteio)}')
print(f'O menor valor foi {min(sorteio)}')