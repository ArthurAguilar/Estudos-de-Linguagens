n1 = float(input('Digite o primeiro segmento: '))
n2 = float(input('Digite o segundo segmento: '))
n3 = float(input('Digite o terceiro segmento: '))

if n1 + n2 > n3 and n1 + n3 > n2 and n2 + n3 > n1:
    if n1 == n2 and n1 == n3:
        print(f'Os segmentos acima PODEM FORMAR um triângulo EQUILÁTERO')
    elif n1 != n2 and n1 != n3:
        print(f'Os segmentos acimam PODEM FORMAR um triângulo ESCALENO')
    else:
        print(f'Os segmentos acimam PODEM FORMAR um triângulo ISÓSCELES')
else:
    print(f'Os segmentos acimam NÃO PODEM FORMAR um triângulo!')