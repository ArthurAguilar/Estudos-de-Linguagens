time = []
cont = 0


while True:
    jogador = {}
    cont += 1
    jogador['Nome'] = str(input('Nome do Jogador: '))
    jogador['Partidas'] = int(input(f'Quantas partidas {jogador["Nome"]} jogou? '))
    jogador['Gols'] = []
    for i in range(jogador['Partidas']):
        jogador['Gols'].append(int(input(f'  Quantos gols na {i+1}ª partida? ')))
    jogador['Total'] = sum(jogador['Gols'])
    jogador['Média'] = jogador['Total'] / jogador['Partidas']
    time.append((jogador.copy()))
    resp = str(input('Deseja continuar? [S/N] ')).upper()
    if resp != 'S' and resp != 'N':
        resp = str(input('Valor inexistente, tente novamente. [S/N]: '))
    if resp in 'Nn':
        break
    

print()
print('*'*40)
print(f'{"RESULTADO":^40}')
print('*'*40)
print(f'{"No.":<4}{"NOME":<10}{"GOLS":^10}{"TOTAL":>15}')
print('-'*40)

for x, det in enumerate(time):
    print(f'{x:<4}{det["Nome"]:<10}{str(det["Gols"]):^10}{det["Total"]:>15}')
print('-'*40)

while True:
    opcao = int(input('Deseja saber os dados de qual jogador? (999 para cancelar): '))
    if opcao == 999:
        break
    if opcao >= len(time):
        print('Valor inválido, tente novamente.')
    else:
        print(f'  ==> Dados do Jogador {time[opcao]["Nome"]}') 
        for i in range(time[opcao]["Partidas"]):
            print(f'      No jogo {i+1} {time[opcao]["Nome"]} fez {time[opcao]["Gols"][i]} gols.')

print(f'{"<<Finalizando>>":^30}')
