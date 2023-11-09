aluno = {}
aluno['Nome'] = str(input('Nome: '))
aluno['Média'] = float(input('Média: '))

if aluno['Média'] < 5:
    aluno['Resultado'] = "Reprovado"
elif aluno['Média']  < 7:
    aluno['Resultado'] = "Recuperação"
else:
    aluno['Resultado'] = "Aprovado"

print('-'*30)
for k, v in aluno.items():
    print(f'{k} é {v}.')
