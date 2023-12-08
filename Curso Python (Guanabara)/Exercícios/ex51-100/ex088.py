from random import randint
from time import sleep

jogosTotal = []

print('*'*30)
print(f'{"BOT DA MEGA SENA":^30}')
print('*'*30)

tent = int(input('Quantos jogos serão gerados? '))

for i in range(0, tent):
    palpites = []
    while len(palpites) < 6:
        n = randint(0, 60)
        if n not in palpites:
            palpites.append(n)
    jogosTotal.append(palpites[:])
               


print('*'*30)
print('Os números sortes foram: ')
for i, l in enumerate (jogosTotal):
    print(f'Jogo {i+1} = {sorted(l)}')
    sleep(.5)
print()
print('*'*10, 'BOA SORTE', '*'*10)    
