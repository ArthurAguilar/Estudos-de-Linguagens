pares = []
impares = []

for i in range(0, 7):
    n = int(input(f'Digite o {i+1}° valor: '))
    if n % 2 == 0:
        pares.append(n)
    else:
        impares.append(n)

print()
print('*'*30)
print(f'Os valores pares são {sorted(pares)}')
print(f'Os valores impares são {sorted(impares)}')
print('*'*30)
