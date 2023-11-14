def leiaInt():
   while True:
    num = input('Digite um número: ')
    if not num:
        print('\033[0;31mNúmero inválido, encerrando o programa!\33[m')
    else:
        if num.isnumeric():
            print(f'O número digitado foi: {num}')
            break
        else:
            print(f'\033[0;31mNúmero inválido, encerrando o programa!\33[m')


leiaInt()
leiaInt()
leiaInt()
