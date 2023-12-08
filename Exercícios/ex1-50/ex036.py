valor = float(input('Qual é o valor da casa? R$'))
salario = float(input('Qual é o salário do comprador? R$'))
prestacao = int(input('Vai parcelar em quantos anos? '))
valorPrestacao = valor / (prestacao * 12)

print(f'Para pagar uma casa de R${valor:.2f} em {prestacao} anos de prestação, o valor será de R${valorPrestacao:.2f}.')
if valorPrestacao >= (salario * 0.3):
    print(f'Empréstimo NEGADO!') 
else:
    print(f'Empréstimo poderá ser CONCEDIDO!')