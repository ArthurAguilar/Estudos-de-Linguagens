estado = {}
brasil = []

for i in range(3):
    estado['UF'] = str(input('Unidade Federativa: '))
    estado['Sigla'] = str(input('Sigla: '))
    brasil.append(estado.copy())

for est in brasil:
    for k, v in est.items():
        print(f'{k} = {v}')
