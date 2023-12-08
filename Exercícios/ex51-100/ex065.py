n = soma = cont = 0
repetir = 'S'
maior = float('-inf') ##Peguei essa dica no google 
menor = float('inf')  ##Essa tbm :D

while repetir == 'S':
    n = int(input('Digite um número: '))
    soma += n
    cont += 1
    repetir = str(input('Quer continuar? (S/N) ')).upper()
    if n > maior:
        maior = n
    if n < menor:
        menor = n
    
media = soma / cont

print(f'''Você digitou {cont} números e a média foi {media:.2f}
O maior valor foi {maior} e o menor foi {menor}''')
