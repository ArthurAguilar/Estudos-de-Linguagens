km = float(input('Quantos KMs percorreu com o carro? '))
dia = int(input('Por quantos dias utilizou ele? '))

custoKm = km * 0.15
custoDia = dia * 60
total = custoKm + custoDia

print(f'O total a pagar é de R${total:.2f}')
