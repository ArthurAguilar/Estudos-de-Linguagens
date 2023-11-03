expressao = str(input('Digite a expressão aritmética: '))
x = 0

for simbolo in expressao:
    if simbolo == '(':
        x += 1
    if simbolo == ')':
        x += 1

if x % 2 == 0:
    print('Parabéns! Sua expressão é válida.')
else:
    print('Expressão inválida! Tente novamente.')