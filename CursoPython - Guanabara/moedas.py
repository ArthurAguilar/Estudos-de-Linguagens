def aumentar(n = 0, taxa = 0):
    result = n + (n * taxa/100)
    return result


def diminuir(n = 0, taxa = 0):
    result = n - (n * taxa/100)
    return result  


def dobro(n = 0):
    n *= 2  
    return n  


def metade(n = 0):
    n *= 0.5
    return n


def moeda(preco = 0, moeda = 'R$'):
    return f'{moeda}{preco:.2f}'.replace('.', ',')
