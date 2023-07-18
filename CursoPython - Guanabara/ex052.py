n = int(input('Digite um número: '))

divisivel = 0
for i in range(1, n+1):
    if n % i == 0:
        print('\033[32m', end='')
        divisivel += 1
    else:
        print('\033[31m', end='')
    print(i, end=' ')

print(f'''\n\033[mO número {n} foi divisível {divisivel} vezes
e por isso ele ''', end="")

if divisivel == 2:
    print('É PRIMO!')
else:
    print('NÃO É PRIMO!')