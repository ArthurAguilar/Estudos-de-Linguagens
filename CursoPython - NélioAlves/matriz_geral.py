## Ler uma matriz quadrada de ordem N e fazer cálculos
import math

n = int(input('Qual a ordem da matriz? '))
mat = [[0 for x in range(n)]for x in range(n)]

##Criação da Matriz
for i in range(n): 
    for j in range(n):
        mat[i][j] = float(input(f'Elemento [{i},{j}]: '))

##SOMAPOSITIVOS
somaPositivos = 0
for i in range(n):
    for j in range(n):
        if mat[i][j] > 0:
            somaPositivos = somaPositivos + mat[i][j]
print(f'\nSOMA DOS POSITIVOS = {somaPositivos}')

##LINHA
linha = int(input("\nEscolha uma linha: "))  
print("LINHA ESCOLHIDA: ", end="")
for i in range(n):
	print(f"{mat[linha][i]:.1f} ", end="")

##COLUNA
coluna = int(input("\n\nEscolha uma coluna: "))
print("COLUNA ESCOLHIDA: ", end="")
for i in range(n):
	print(f"{mat[i][coluna]:.1f} ", end="")

##DIAGONAL
print('\n\nDIAGONAL PRINCIPAL = ', end="")    
for i in range(n):
    for j in range(n):
        if i == j:
            print(mat[i][j], end=" | ")

##MATRIZ ALTERADA
print(f'\n\nMATRIZ ALTERADA:')
for i in range(n):
    for j in range(n):
        if mat[i][j] < 0:
           mat[i][j] = math.pow(mat[i][j], 2)
        print(mat[i][j], end=" | ")
    print()