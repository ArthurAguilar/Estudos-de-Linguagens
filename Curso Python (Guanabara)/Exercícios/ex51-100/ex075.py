n = (int(input('Digite um número: ')), (int(input('Digite outro número: '))),
     int(input('Digite mais um número: ')), int(input('Digite o último número: ')))

print(f'\nVocê digitou os valores ', end='')
for i in n:
    print(f'{i}', end=' ')
if 9 in n:
    print(f'\nO valor 9 apareceu {n.count(9)} vezes.')
else:
    print('\nNão há o número 9.')
if 3 in n:
    print(f'O valor 3 apareceu na {n.index(3)+1}ª posição.')
else:
    print(f'Não há o número 3.')
print(f'Os valores pares digitados foram: ', end='')
for i in n:
    if i % 2 == 0:
        print(i, end=' ')
