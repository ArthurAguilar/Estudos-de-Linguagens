import moedas

preco = float(input('Digite o valor: R$'))

print(f'Aumentando R${moedas.moeda(preco)} em 10%, fica {moedas.moeda(moedas.aumentar(preco, 10))}')
print(f'Diminuindo R${moedas.moeda(preco)} em 10%, fica {moedas.moeda(moedas.diminuir(preco, 10))}')
print(f'O dobro de R${moedas.moeda(preco)} é {moedas.moeda(moedas.dobro(preco))}')
print(f'A metade de R${moedas.moeda(preco)} é {moedas.moeda(moedas.metade(preco))}')
