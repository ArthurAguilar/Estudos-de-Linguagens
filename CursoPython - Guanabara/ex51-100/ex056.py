somaIdade = 0
mulherAte20 = 0
homemVelho = ""
idadeVelho = 0

for i in range(1, 5):
    print(f'----- {i}ª PESSOA -----')
    nome = str(input(f'Nome: '))
    idade = int(input(f'Idade: '))
    sexo = str(input(f'Sexo (M/F): ')).lower()
    somaIdade += idade
    if sexo == "m" and idade > idadeVelho:
        homemVelho = nome
        idadeVelho = idade
    if sexo == "f" and idade < 20:
        mulherAte20 += 1

media = somaIdade / 4

print(f'''\nA média de idade do grupo é de {media:.1f} anos.
O homem mais velho tem {idadeVelho} anos e se chama {homemVelho}.
Ao todo são {mulherAte20} mulheres com menos de 20 anos.''')
