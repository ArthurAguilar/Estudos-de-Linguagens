soma = 0
valor = 0

for i in range(1, 501, 2):
    if i % 3 == 0:
        soma += i
        valor += 1

print(f'A soma de todos os {valor} valores solicitados é {soma}')


