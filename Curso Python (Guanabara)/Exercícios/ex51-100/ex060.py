n = int(input('Digite o número que deseja calcular o fatorial: '))
cont = n
fatorial = 1

while cont > 0:
    print(f'{cont}', end=" ")
    print('x ' if cont > 1 else ' ', end="")
    fatorial *= cont
    cont -= 1

print(f'\nO fatorial de {n}! é {fatorial}.')


