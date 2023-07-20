print('-'*30)
print(f'     LOJA SUPER BARATÃO')
print('-'*30)

total = acimaMil = 0
nomeBarato = ''
maisBarato = float('inf')

while True:
    nome = str(input('Nome do Produto: '))
    preco = int(input('Preço: R$'))
    total += preco
    if preco > 1000:
        acimaMil += 1
    elif preco < maisBarato:
        maisBarato = preco
        nomeBarato = nome
    cont = str(input('Quer continuar (S/N)? ')).upper()
    while cont not in 'SsNn':
        cont = str(input('Valor incorreto, tente novamente (S/N) :'))
    if cont == 'N':
        break

print(f''' --------- FIM DO PROGRAMA ---------
O total da compra foi R${total:.2f}
Temos {acimaMil} produto custando mais de R$1000.00
O produto mais barato foi a(o) {nomeBarato} que custa R${maisBarato:.2f}.''')