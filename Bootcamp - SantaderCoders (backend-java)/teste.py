meuVetor = [] = 5
meuUetor = []

meuVetor[1] = 2
meuVetor[2] = 3
meuVetor[3] = 4
meuVetor[4] = 5
meuVetor[5] = 6

n = 5

for i in range(n):
    meuUetor[i] = meuVetor[i] * i

print(meuUetor[2], meuUetor[4])