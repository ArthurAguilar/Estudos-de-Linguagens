nums = []

for i in range(0, 5):
    n = int(input('Digite um valor: '))
    if i == 0 or n > nums[-1]:
        nums.append(n)
    else:
        pos = 0
        while pos < len(nums):
            if n <= nums[pos]:
                nums.insert(pos, n)
                break
            pos += 1

print('=-'*30)
print(f'Os valores digitados foram: ', end='')
for i in range(0, 5):
    print(f'{nums[i]}', end=' ')
print('=-'*30)
