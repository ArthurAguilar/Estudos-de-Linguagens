def ficha():
    """Ficha para consultar nome e gols de um jogador

    Args:
        nome (_type_): Consultar nome do jogdaor. Se nada for digitado, retorna '<desconhecido>'
        gols (_type_): Consultar quantidade de gols feito pelo jogador. Se nada for digitado, retorna 0
    """
    nome = input('Digite o nome do jogador: ')
    gols = input('Quantos gols foram feitos? ')
    if not nome:
        nome = '<desconhecido>'    
    if gols.isnumeric():
        gols = int(gols)
    else:
        gols = 0    
    if not gols:
        gols = 0       
    print(f'O jogador {nome} fez {gols} gols.')


ficha()
ficha()
ficha()
