def fatorial(n):
    f = 1
    for c in range(n, 0, -1):
        f *= c
    return f


num = int(input('Digite um valor: '))
fat = fatorial(num)
print(f'O fatorial de {num} é {fat}.')