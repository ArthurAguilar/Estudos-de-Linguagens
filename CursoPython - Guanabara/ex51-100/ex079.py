nums = []

while True:
    n = int(input('Digite um valor numérico: '))
    if n not in nums:
        nums.append(n)
        print('Número adicionado!')
    else:
        print('Já tem esse número, tente novamente!')
    x = str(input('Deseja continuar? [s/n] '))
    if x != 's':
        break

print('-='*30)
print(f'Os valores digitados foram: {sorted(nums)}')



        