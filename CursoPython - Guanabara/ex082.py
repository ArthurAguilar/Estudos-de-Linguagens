list = []

while True:
    n = int(input('Digite um valor: '))
    list.append(n)
    resp = str(input('Deseja continuar? [S/N] '))
    if resp in 'Nn':
        break

print('*'*50)
print('Valores pares digitados: ', end='')
for i, v in enumerate(list):
    if v % 2 == 0:
        print(f'{i}', end=' ')    
print()
print('Valores ímpares digitados: ', end='')
for i, v in enumerate(list):
    if v % 2 != 0:
        print(f'{i}', end=' ')
print()
print(f'Todos os valores digitados: {sorted(list)}')
