homens = mais18 = menos20 = 0

while True:
    print('-'*30)
    print(f'     CADASTRE UMA PESSOA')
    print('-'*30)
    idade = int(input('Idade: '))
    if idade >= 18:
        mais18 += 1
    sexo = str(input('Sexo (M/F): ')).upper()
    if sexo == 'M':
        homens += 1
    elif sexo == 'F' and idade < 20:
        menos20 += 1
    print('-'*30)
    cont = str(input('Quer continuar (S/N)? ')).upper()
    while cont not in 'SsNn':
        cont = str(input('Valor incorreto, tente novamente (S/N) :'))
    if cont == 'N':
        break

print(f'''\nTotal de pessoas com mais de 18 anos = {mais18}
Ao todo temos {homens} homens cadastrados.
E temos {menos20} mulheres com menos de 20 anos.''')
