nums = []

while True:
    n = int(input('Digite um valor: '))
    nums.append(n)
    r = str(input('Deseja continuar? [S/N] '))
    if r in 'Nn':
        break

print()
print('*'*50)
print(f'O total de números digitados foram: {len(nums)}')
print(f'A lista em ordem decrescente fica: {sorted(nums, reverse=True)}')
if 5 in nums:
    print(f'Sim, o número 5 está na lista!')
else:
    print(f'Não, o número 5 não está na lista!')
print('*'*50)
