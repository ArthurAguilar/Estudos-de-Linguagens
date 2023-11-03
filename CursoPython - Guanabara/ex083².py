expressao = (str(input('Digite uma expressão aritmética:')))
pilha = []

for simbolo in expressao:
    if simbolo == '(':
        pilha.append('(')
    elif simbolo == ')':
        if len(pilha) > 0:
            pilha.pop()
        else:
            pilha.append(')')
            break

if len(pilha) > 0:
    print('Expressão incorreta, tente novamente!')
else:
    print('Parabéns, sua expressão é válida!')
    