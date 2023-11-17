salario = int(input('Qual é o salário do funcionário? R$'))

if salario <= 1250:
    aumento = salario * 1.15
else:
    aumento = salario * 1.10

print(f'O funcionário que ganhava R${salario:.2f} passa a ganhar R${aumento:.2f} agora.')
print(f'Totalizando um aumento de R${aumento-salario:.2f}')