from datetime import date
anoAtual = date.today().year

maioridade = 0
for i in range(1, 8):
    x = int(input(f'Digite o ano de nascimento da {i}ª pessoa: '))
    if (x - anoAtual) * (-1) >= 18:
        maioridade += 1
menoridade = 7 - maioridade

print(f'''\nAo todo tivemos {maioridade} pessoas maiores de idade.
E também tivemos {menoridade} pessoas menores de idade.''')
