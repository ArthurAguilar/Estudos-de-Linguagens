def fatorial(n, show=False):
    """Cálculo de Fatorial

    Args:
        n (_type_): Definir o valor que quer calcular
        show (bool, optional): Mostrar a conta feita

    Returns:
        Valor final do cálculo fatorial
    """
    f = 1
    for c in range(n, 0, -1):
        if show:
            print(f'{c}', end=' ')
            if c > 1:
                print('x', end=' ')
            else:
                print('=', end=' ')

        f *= c
    return f


print(fatorial(5))
print('-='*30)
print(fatorial(5, show=True)) 
