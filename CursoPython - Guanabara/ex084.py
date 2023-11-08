dados = []
pessoa = []
mPesada = float('-inf')
mLeve = float('inf')

while True:
    pessoa.append(str(input('Nome: ')))
    pessoa.append(float(input('Peso: ')))
    dados.append(pessoa[:])
    if pessoa[1] > mPesada:
        mPesada = pessoa[1]
    elif pessoa[1] < mLeve:
        mLeve = pessoa[1]
    pessoa.clear()
    resp = str(input('Deseja continuar? [S/N] '))
    if resp in 'Nn':
        break

print('*'*30)
print(f'O número total de pessoas foi {len(dados)}.')
print(f'O maior peso foi {mPesada}kg. Esse peso foi de ', end='')
for p in dados:
    if p[1] == mPesada:
        print(f'{p[0]}', end='..')
print(f'\nO menor peso foi {mLeve}kg.Esse peso foi de ', end='')
for p in dados:
    if p[1] == mLeve:
        print(f'{p[0]}', end='..')
