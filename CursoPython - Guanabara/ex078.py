nums = []


for cont in range(1, 6):
    nums.append(int(input(f'Digite o {cont}° valor: ')))

print('-='*30)
print('Você digitou os valores: ', end=' ')
for c in nums:
    print(f'{c}', end=' ')
print(f'\nO menor valor digitado foi {min(nums)} nas posições: ', end='')
for x, y in enumerate(nums):
    if y == min(nums):
        print(f'{x+1}', end= ' ')    
print(f'\nO maior valor digitado foi {max(nums)} nas posições: ', end='')
for x, y in enumerate(nums):
    if y == max(nums):
        print(f'{x+1}', end= ' ')
print()
print('-='*30)
