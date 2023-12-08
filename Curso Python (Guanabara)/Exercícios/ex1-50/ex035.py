print("=-="*30)
print(f'Analisador de Triângulos')
print("=-="*30)

n1 = float(input('Primeiro segmento: '))
n2 = float(input('Segundo segmento: '))
n3 = float(input('Terceiro segmento: '))

if n1 + n2 > n3 and n2 + n3 > n1 and n3 + n1 > n2:
    print(f'Os segmentos acima PODEM formar um triângulo.')
else:
    print(f'Os segmentos acima NÃO PODEM formar um triângulo.')