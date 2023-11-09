aluno = {}
aluno['Nome'] = str(input('Nome: '))
aluno['Média'] = float(input('Média: '))

if aluno['Média'] < 5:
    aluno['Resultado'] = "Reprovado"
elif aluno['Média']  < 7:
    aluno['Resultado'] = "Recuperação"
else:
    aluno['Resultado'] = "Aprovado"

print(f'''
Nome do Aluno: {aluno['Nome']}
Média do Aluno: {aluno['Média']}
Situação Final: {aluno['Resultado']}
''')
