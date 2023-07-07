##Programa para ler três medidas (A, B, C), calcular e imprimir a área do quadrado, triângulo e trapézio.

A = float(input('Digite a medida A: '))
B = float(input('Digite a medida B: '))
C = float(input('Digite a medida C: '))

##Cálculos

quadrado = A * A
triangulo = (A * B) / 2
trapezio = ((A + B) * C) / 2

##Resultados

print(f''' 
ÁREA DO QUADRADO = {quadrado:.4f}
ÁREA DO TRIÂNGULO = {triangulo:.4f}
ÁREA DO TRAPÉZIO = {trapezio:.4f}
''')

