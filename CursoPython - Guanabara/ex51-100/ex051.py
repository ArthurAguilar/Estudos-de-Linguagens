print('='*30)
print('     10 TERMOS DE UMA PA')
print('='*30)

primeiroTermo = int(input('Digite o valor do 1° termo: '))
razao = int(input('Digite o valor da razão: '))
decimoTermo = primeiroTermo + (10 - 1) * razao ## Essa eu tive que pegar cola

for i in range(primeiroTermo, decimoTermo+1, razao):
    print(i, end=" -> ")
print('Acabou-se o que era doce!')