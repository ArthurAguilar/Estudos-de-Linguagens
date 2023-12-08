n = int(input('Digite um número: '))
print(f'''Escolha uma das bases para conversão: 
[ 1 ] converter para BINÁRIO      
[ 2 ] converter para OCTAL
[ 3 ] converter para HEXADECIMAL''')
opcao = int(input('Sua opção: '))

if opcao == 1:
    print(f'{n} convertido para BINÁRIO é igual a {bin(n)[2:]}')
elif opcao == 2:
    print(f'{n} convertido para OCTAL é igual a {oct(n)[2:]}')
elif opcao == 3:
    print(f'{n} convertido para HEXADECIMAL é igual a {hex(n)[2:]}')
else:
    print(f'Opção inválida, tente novamente!')