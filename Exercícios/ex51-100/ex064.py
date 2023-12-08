n = 0
soma = n
cont = 0
while n != 999:    
    soma += n
    cont += 1
    n = int(input('Digite um número (999 para parar): '))

print(f'Você digitou {cont-1} e a soma entre eles foi de {soma}.')