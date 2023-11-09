from time import sleep
from random import randint

players = {
           'Player 1': randint(1, 6),
           'Player 2': randint(1, 6),
           'Player 3': randint(1, 6),
           'Player 4': randint(1, 6)}

print('-'*30)
print(f'{"VALORES SORTEADOS":^30}')
print('-'*30)

for k, v in players.items():
    print(f'O jogador {k} tirou {v}.')
    sleep(.8)

print('-'*30)
print(f'{"RANKING DOS JOGADORES":^30}')
print('-'*30)

for i, (player, score) in enumerate(sorted(players.items(), key=lambda x: x[1], reverse=True)):
    print(f'{i+1}° Lugar: {player} com {score} pontos')
print('-'*30)
