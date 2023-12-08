distancia = int(input('Qual a distancia da viagem? '))

if distancia <= 200:
    preco = distancia * 0.5 
else:
    preco = distancia * 0.45

print(f'''Você está prestar a começar uma viagem de {distancia:.1f}Kms.
O preço da sua passagem será de R${preco:.2f}.''')
