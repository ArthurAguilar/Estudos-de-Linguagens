jogador = {}

jogador['Nome'] = str(input('Nome do Jogador: '))
jogador['Partidas'] = int(input(f'Quantas partidas {jogador["Nome"]} jogou? '))
jogador['Gols'] = []

for i in range(jogador['Partidas']):
    jogador['Gols'].append(int(input(f'  Quantos gols na {i+1}ª partida? ')))

jogador['Total'] = sum(jogador['Gols'])
jogador['Média'] = jogador['Total'] / jogador['Partidas']

print('-'*30)
print(jogador)
print('-'*30)
for k, v in jogador.items():
    print(f'O campo {k} tem o valor {v}.')
print('-'*30)
print(f'O jogador {jogador["Nome"]} jogou {jogador["Partidas"]} partidas..')

for i, j in enumerate(jogador['Gols']):
    print(f'   => Na partida {i+1}, {jogador["Nome"]} fez {jogador["Gols"][i]} gols.')
print(f'Foi um total de {jogador["Total"]} gols.')
