import random
import time

print("=-" * 18)
print('=-=-= PEDRA - PAPEL - TESOURA =-=-=')
print("=-" * 18)
repetir = "s"
itens = ('Pedra', 'Papel', 'Tesoura ')


while repetir == "s":
    jogadaPC = random.randint(0,2)
    print(f'''Suas opções
        [ 0 ] PEDRA
        [ 1 ] PAPEL
        [ 2 ] TESOURA''')
    opcao = int(input('Qual é a sua jogada? '))
    while opcao not in [0, 1, 2]:
        opcao = int(input('Opção inválida, tente novamente! (0, 1 ou 2) '))       
    
    print("=-" * 18)
    print(f'\nComputador jogou {itens[jogadaPC]}')
    print(f'Jogador jogou {itens[opcao]}')

    time.sleep(.8)
    print('\nJO')
    time.sleep(.8)
    print('KEN')
    time.sleep(.8)
    print('PO!!!\n')

    if opcao == 0: ## PEDRA*        
        if jogadaPC == 0:
            print("=-" * 18)
            print(f'O JOGO EMPATOU!!')
        elif jogadaPC == 1:
            print("=-" * 18)
            print(f'O COMPUTADOR VENCEU!!')
        elif jogadaPC == 2:
            print("=-" * 18)
            print(f'O JOGADOR VENCEU!!')

    elif opcao == 1: ## PAPEL
        if jogadaPC == 0:
            print("=-" * 18)
            print(f'O JOGADOR VENCEU!!')
        elif jogadaPC == 1:
            print("=-" * 18)
            print(f'O JOGO EMPATOU!!')
        elif jogadaPC == 2:
            print("=-" * 18)
            print(f'O COMPUTADOR VENCEU!!')

    elif opcao == 2: ## TESOURA
        if jogadaPC == 0:
            print("=-" * 18)
            print(f'O COMPUTADOR VENCEU!!')
        elif jogadaPC == 1:
            print("=-" * 18)
            print(f'O JOGADOR VENCEU!!')
        elif jogadaPC == 2:
            print("=-" * 18)
            print(f'O JOGO EMPATOU!')

    print("=-" * 18)
    repetir = input(str('Tentar novamente? ("S" ou "N") '))

print("=-" * 18)
print('Finalizando o game...')
time.sleep(1)