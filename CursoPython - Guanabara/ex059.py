from time import sleep
n1 = int(input('Primeiro valor: '))
n2 = int(input('Segundo valor: '))

opcao = 0
soma = n1 + n2     ## CÁLCULOS
multiplicacao = n1 * n2
maior = n1
if n2 > n1:
    maior = n2

while opcao != 5:
    print(f'''Nossas ferramentas: 
      [ 1 ] SOMAR
      [ 2 ] MULTIPLICAR
      [ 3 ] MAIOR
      [ 4 ] NOVOS NÚMEROS
      [ 5 ] SAIR DO PROGRAMA''')
    opcao = int(input('>>> Qual é a sua opção? '))
    if opcao == 1:
        print(f'A soma entre {n1} e {n2} é {soma}.')
    if opcao == 2:
        print(f'A multiplicação entre {n1} e {n2} é {multiplicacao}.')
    if opcao == 3:
        print(f'O número maior entre {n1} e {n2} é {maior}.')
    if opcao == 4:
        print(f'Informe os novos valores!')
        n1 = int(input('Primeiro valor: '))
        n2 = int(input('Segundo valor: '))

    print()
    print('*-' * 25)
    print()
    sleep(2)
