n1 = float(input('Primeiro número: '))
n2 = float(input('Segundo número: '))

if n1 > n2:
    print(f'O primeiro número ({n1:.0f}) é maior!')
elif n1 == n2:
    print(f'Os dois valores ({n1:.0f} e {n2:.0f}) são iguais!')
else:
    print(f'O segundo número ({n2:.0f}) é maior! ')