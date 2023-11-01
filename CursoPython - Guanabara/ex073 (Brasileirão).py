times = ('Botafogo', 'Grêmio', 'Flamengo', 'Palmeiras', 'Athletico-PR', 'São Paulo', 
         'Fluminense', 'Bragantino', 'Fortaleza', 'Internacional', 'Cruzeiro', 
         'Cuiabá', 'Atlético-MG', 'Santos', 'Corinthians', 'Goiás', 'Bahia', 
         'Coritiba', 'América-MG', 'Vasco da Gama')

print('=-'*20)
print(f'Lista de times do Brasileirão: {times}')
print('=-'*20)
print(f'Os 5 primeiros são {times[0: 5]}')
print('=-'*20)
print(f'Os últimos 4 são {times[-4:]}')
print('=-'*20)
print(f'Times em ordem alfabética: {sorted(times)}')
print('=-'*20)
print(f'O Flamento está na {times.index("Flamengo")+1}ª posição.')
