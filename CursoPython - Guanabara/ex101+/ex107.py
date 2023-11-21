from uteis.moedas import *

preco = float(input('Digite o valor: R$'))

print(f'Aumentando R${preco:.2f} em 10%, fica R${moedas.aumentar(preco, 10):.2f}')
print(f'Diminuindo R${preco:.2f} em 10%, fica R${moedas.diminuir(preco, 10):.2f}')
print(f'O dobro de R${preco:.2f} é R${moedas.dobro(preco):.2f}')
print(f'A metade de R${preco:.2f} é R${moedas.metade(preco):.2f}')

