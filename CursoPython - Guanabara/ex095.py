time = []
jogador = {}
cont = 0
while True:
    cont += 1
    jogador['Nome'] = str(input('Nome do Jogador: '))
    jogador['Partidas'] = int(input(f'Quantas partidas {jogador["Nome"]} jogou? '))
    jogador['Gols'] = []
    for i in range(jogador['Partidas']):
        jogador['Gols'].append(int(input(f'  Quantos gols na {i+1}ª partida? ')))
    jogador['Total'] = sum(jogador['Gols'])
    jogador['Média'] = jogador['Total'] / jogador['Partidas']
    resp = str(input('Deseja continuar? [S/N] '))
    if resp in 'Nn':
        break
time.append((jogador.copy()))

print()
print('*'*40)
print(f'{"RESULTADO":^40}')
print('*'*40)
print(f'{"No.":<4}{"NOME":<10}{"GOLS":^10}{"TOTAL":>15}')
print('-'*40)

for i, det in enumerate(time):
    print(f'{i:<4}{det["Nome"]}{}')




print('-'*40)
for i, j in enumerate(jogador['Gols']):
    print(f'   => Na partida {i+1}, {jogador["Nome"]} fez {jogador["Gols"][i]} gols.')
print(f'Foi um total de {jogador["Total"]} gols.')
