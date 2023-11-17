def linha40():
    print('-' * 40)


def aumentar(n = 0, taxa = 0, format = False):
    result = n + (n * taxa/100)
    if format:
        return f'R${result:.2f}'.replace('.', ',')
    else:
        return result
    

def diminuir(n = 0, taxa = 0, format = False):
    result = n - (n * taxa/100)
    if format:
        return f'R${result:.2f}'.replace('.', ',')
    else:
        return result


def dobro(n = 0, format = False):
    result = n * 2  
    if format:
        return f'R${result:.2f}'.replace('.', ',')
    else:
        return result
    

def metade(n = 0, format = False):
    result = n * 0.5
    if format:
        return f'R${result:.2f}'.replace('.', ',')
    else:
        return result


def moeda(preco = 0, moeda = 'R$'):
    return f'{moeda}{preco:.2f}'.replace('.', ',')


def resumo(preco, aumento = 0, diminuicao = 0):
    linha40()
    print(f'{"RESUMO DO VALOR":^40}')
    linha40()    
    print(f'Preço analisado: \t\t{moeda(preco)}')
    print(f'Dobro do preço: \t\t{moeda(dobro(preco))}')
    print(f'Metade do preço: \t\t{moeda(metade(preco))}')
    print(f'{aumento}% de aumento: \t\t{moeda(aumentar(preco, 20))}')
    print(f'{diminuicao}% de redução: \t\t{moeda(diminuir(preco, 12))}')
    linha40()