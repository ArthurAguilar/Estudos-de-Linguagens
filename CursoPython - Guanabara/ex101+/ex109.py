from uteis import moedas
preco = float(input('Digite o valor: R$'))

print(f'Aumentando {moedas.moeda(preco)} em 10%, fica {moedas.aumentar(preco, 10, format)}')
print(f'Diminuindo {moedas.moeda(preco)} em 10%, fica {moedas.diminuir(preco, 10, format)}')
print(f'O dobro de {moedas.moeda(preco)} é {moedas.dobro(preco, format)}')
print(f'A metade de {moedas.moeda(preco)} é {moedas.metade(preco, format)}')
