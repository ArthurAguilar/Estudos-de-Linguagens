galera = []
total = 0
soma_idade = 0

while True:
    pessoa = {}
    total += 1
    pessoa['Nome'] = str(input('Nome: ')).title()
    
    while True:
        pessoa['Sexo'] = str(input('Sexo (M ou F): ')).upper()
        if pessoa['Sexo'] == 'M' or pessoa['Sexo'] == 'F':
            break
        else:
            print('Resposta inválida, tente novamente.')
          
    pessoa['Idade'] = int(input('Idade: '))
    soma_idade += pessoa['Idade']  
    galera.append(pessoa)

    resp = str(input('Deseja continuar? (S ou N) '))
    if resp not in 'Ss' and resp not in 'Nn':
        resp = str(input('Opção inválida, tente novamente (S ou N) '))
    if resp in 'Nn':
        break

media = soma_idade / total

print('-='*30)
print(f'{"CONSIDERAÇÕES FINAIS":^60}')
print('-='*30)
print(f'O total de pessoas cadastrada foram {total} pessoa(s).')
print(f'A média da idade das pessoas cadastrada foi de {media:.1f} anos.')
print(f'Nome das mulheres cadastradas: ', end='')
for i in range(len(galera)):
    if galera[i]['Sexo'] == 'F':
        print(f'{galera[i]["Nome"]}', end='..')
print()
print(f'Pessoas com idade acima da média: ', end='')
for i in range(len(galera)):
    if galera[i]['Idade'] >= media:
        print(f'{galera[i]["Nome"]}', end='..')
print()
print('-='*30)
