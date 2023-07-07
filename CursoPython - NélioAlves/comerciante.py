## Programa para calcular lucro de um estabelecimento

n = int(input('Quantos dados de produtos serão digitados? '))
nome = [0 for x in range(n)]
valorCompra = [0 for x in range(n)]
valorVenda = [0 for x in range(n)]

for i in range(n): ## Dados
    print(f'Produto {i+1}')
    nome[i] = str(input('Nome: '))
    valorCompra[i] = float(input('Preço de compra: '))
    valorVenda[i] = float(input('Valor de venda: '))

abaixo = 0
entre = 0
acima = 0
totalCompra = 0
totalVenda = 0
lucroTotal = 0

for i in range(n): ##Cálculo lucro
    lucro = valorVenda[i] - valorCompra[i]
    lucroTotal = lucroTotal + lucro

for i in range(n): ##Cálculo "total"
    totalCompra = totalCompra + valorCompra[i]
    totalVenda = totalVenda + valorVenda[i]
    porcLucro = (valorVenda[i] - valorCompra[i]) / valorCompra[i] * 100
    if porcLucro < 10:
        abaixo = abaixo + 1
    elif porcLucro < 20:
        entre = entre + 1
    else:
        acima = acima + 1

print(f''' 
Lucro abaixo de 10% = {abaixo}
Lucro entre 10% e 20% = {entre}
Lucro acima de 20% = {acima}
Valor total de compra = {totalCompra:.2f}
Valor total de venda = {totalVenda:.2f}
Lucro total = {lucroTotal:.2f}
''')