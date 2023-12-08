matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
somaColuna = somaPares = maiorValor = 0

for l in range(3):
    for c in range(3):
        matriz[l][c] = int(input(f'Digite um valor para [{l},{c}]: '))

print('*'*30)
for l in range(3):
    for c in range(3):
        print(f'[{matriz[l][c]:^5}]', end='')
        if c == 2:
            somaColuna += matriz[l][c]

        if matriz[l][c] % 2 == 0:
            somaPares += matriz[l][c]
    print()

for l in range(3):
    if matriz[1][l] > maiorValor:
        maiorValor = matriz[1][l]

print('*'*30)
print(f'A soma total dos valores pares digitados é {somaPares}.')
print(f'A soma dos valores da terceira coluna é {somaColuna}.')
print(f'O maior valor da segunda linha é {maiorValor}.')
