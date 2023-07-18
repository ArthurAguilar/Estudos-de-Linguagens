maiorPeso = 0
menorPeso = 0 ##Fiz colocando 9999 como menor Peso, mas mudei, seguindo a dica do professor, pois alguém pode enviar um número maior que esse e dará erro

for i in range(1, 6):
    peso = float(input(f'Digite o valor da {i}ª pessoa: '))
    if i == 1:
        maiorPeso = peso
        menorPeso = peso
    else:
        if peso > maiorPeso:
            maiorPeso = peso
        if peso < menorPeso:
            menorPeso = peso

print(f'''\nO maior peso lido foi de {maiorPeso:.1f}Kg
O menor peso lido foi de {menorPeso:.1f}Kg''')
