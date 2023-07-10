import math
cateto = float(input('Digite o comprimento do Cateto Oposto: '))
adjacente = float(input('Digite o comprimento do Cateto Adjacente: '))
hipotenusa = math.hypot(cateto, adjacente)

print(f'A hipotenusa vai medir {hipotenusa:.2f}')
