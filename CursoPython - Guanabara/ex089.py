turma = []
media = []
cont = 0

while True:
    cont += 1
    aluno = []
    aluno.append(str(input('Nome: ')))
    aluno.append(float(input('Nota do 1° semestre: ')))
    aluno.append(float(input('Nota do 2° semestre: ')))
    media.append((aluno[1] + aluno[2]) / 2)
    resp = str(input('Deseja continuar? [S/N] '))
    turma.append(aluno)
    if resp in 'Nn':
        break

print()
print('*'*30)
print(f'{"BOLETIM DO ANO":^30}')
print('*'*30)
print(f'{"No.":<4}{"NOME":<10}{"MÉDIA":>8}')
print('-'*30)

for i, aluno in enumerate(turma):
    print(f'{i:<4}{aluno[0]:<10}{media[i]:>8.2f}')

while True:
    print('-'*30)
    opcao = int(input('Deseja verificar a nota de qual aluno? [999 interrompe.] '))
    if opcao == 999:
        print('FINALIZANDO...')
        break
    if opcao <= len(turma) - 1:
       print(f'As notas de {turma[opcao][0]} são {turma[opcao][1], turma[opcao][2]}') 
    else:
        print('Número inválido, tente novamente: ')

print('Até mais!')
