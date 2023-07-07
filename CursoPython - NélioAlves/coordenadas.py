## Programa para ler os valores das coordenadas X e Y de um ponto no plano cartesiano.

X = float(input('Digite o valor de X: '))
Y = float(input('Digite o valor de Y: '))

if X == 0 and Y == 0:
    print('Origem')
elif X == 0 and Y != 0:
    print('Eixo X')
elif Y == 0 and X != 0:
    print('Eixo Y')   
      
if X > 0:
    if Y > 0:
        print('Q1')
    else:
         print('Q4')

if X < 0:
    if Y > 0:
        print('Q2')
    else:
         print('Q3')
