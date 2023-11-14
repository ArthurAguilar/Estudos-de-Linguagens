def notas(situation=False):
    """Função para consultar notas dos alunos

    Args:
        situation (bool, optional): opção para mostrar a situação da turma.
    """
    sala = {}
    turma = []
    n = int(input('Quantas notas serão digitadas? '))
    for i in range(n):
        nota = int(input('Digite a nota: '))
        turma.append(nota)
    print(f'As notas da turma são: {turma}')
    sala['Total'] = n
    sala['Maior'] = max(turma)
    sala['Menor'] = min(turma)
    sala['Média'] = sum(turma) / n

    if situation:
        if sala['Média'] > 9:
            sala['Situação'] = 'Excelente'
        elif sala['Média'] > 7:
            sala['Situação'] = 'Boa'
        elif sala['Média'] > 5:
            sala['Situação'] = 'Razoável'
        else:
            sala['Situação'] = 'Ruim'
    
    print(sala)
        
help(notas)
notas(situation=True)
notas()

