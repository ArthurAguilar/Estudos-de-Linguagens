from datetime import date
date = date.today().year
pessoa = {}

pessoa['Nome'] = str(input('Nome: '))
ano = int(input('Ano de Nascimento: '))
pessoa['Idade'] = (ano - date) * -1
while True:
    pessoa['CTPS'] = int(input('N° da CTPS (0 caso não tenha): '))
    if pessoa['CTPS'] == 0:
        break
    else:
        pessoa['Contratação'] = int(input('Ano de contratação: '))
        pessoa['Salário'] = float(input('Valor do salário:R$ '))
        pessoa['Aposentadoria'] = pessoa['Idade'] + ((pessoa['Contratação'] + 35) - date)
        break

print('-'*30)
print(f'{"Dados Pessoais":^30}')
print('-'*30)
for k, v in pessoa.items():
    print(f'{k} tem valor {v}')
print('-'*30)
