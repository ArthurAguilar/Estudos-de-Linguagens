from random import randint
vitoria = 0

while True:
    valorComputador = randint(0, 10)
    n = int(input('\nDigite um valor: '))
    jogador = str(input('Par ou Ímpar? (P/I) ')).upper()
    while jogador not in 'PpIi':
        jogador = str(input('Valor incorreto, tente novamente (P/I): '))
    soma = valorComputador + n
    print(f'''\nVocê jogou {n} e o computador {valorComputador}
Total de {soma} e foi {'PAR' if soma % 2 == 0 else 'ÍMPAR'}''')
    
    if jogador == 'P':
        if soma % 2 == 0:
            print(f'Parabéns, você venceu!')
            vitoria += 1
        else:
            print(f'Você PERDEU!!')
            break
    elif jogador == 'I':
        if soma % 2 == 1:
            print(f'Parabéns, você venceu!')
            vitoria += 1
        else:
            print(f'Você PERDEU!!')
            break
    
print(f'\nGAME OVER... Você venceu {vitoria} vezes.')
