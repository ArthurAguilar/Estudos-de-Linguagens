nums = []
pares = []
impares = []

while True:
    nums.append(int(input('Digite um valor: ')))
    resp = str(input('Deseja continuar? [S/N] '))
    if resp in 'Nn':
        break

for i, j in enumerate(nums):
    if j % 2 == 0:
        pares.append(j)
    else:
        impares.append(j)

print()
print('*'*30)
print(f'Os valores pares são: {pares}')
print(f'Os valores impares são: {impares}')
print(f'A lista completa fica: {nums}')
print('*'*30)
