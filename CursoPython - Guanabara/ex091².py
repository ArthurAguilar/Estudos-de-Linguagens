from random import randint
from time import sleep
from operator import itemgetter

players = {
    'Jogador 1' : randint(1, 6),
    'Jogador 2' : randint(1, 6),
    'Jogador 3' : randint(1, 6),
    'Jogador 4' : randint(1, 6)
}

print('-'*30)
print(f'{"VALORES SORTEADOS":^30}')
print('-'*30)
for k, v in players.items():
    print(f'O {k} tirou {v}.')
    sleep(.7)

print('-'*30)
print(f'{"RANKING DOS JOGADORES":^30}')
print('-'*30)

ranking = []
ranking = sorted(players.items(), key=itemgetter(1), reverse=True)

for i, j in enumerate(ranking):
    print(f'O {i+1}° lugar foi {j[0]} com {j[1]}.')
print('-'*30)
