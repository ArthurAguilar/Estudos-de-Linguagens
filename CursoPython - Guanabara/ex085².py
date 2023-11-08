num = [[], []]

for i in range(0, 7):
    n = int(input(f'Digite o {i+1}° valor: ')) 
    if n % 2 == 0:
        num[0].append(n)
    else:
        num[1].append(n)
    
print()
print('*'*30)
print(f'Os valores pares são {sorted(num[0])}')
print(f'Os valores impares são {sorted(num[1])}')
print('*'*30)
