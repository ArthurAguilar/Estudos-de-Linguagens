soma = 0

for i in range(1,7):
    n = int(input(f'Digite o {i}° valor: '))
    if n % 2 == 0:
        soma += n
 
print(f'A soma total dos números pares é {soma}!')