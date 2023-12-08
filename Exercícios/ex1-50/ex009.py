n = int(input('Digite um número para ver sua tabuada: '))

print("*" * 30)
for i in range(11):
    print(f'         {n}x{i} = {n*i}')
print("*" * 30)