valorCompra = float(input('Digite o valor da compra: '))
print(f'''Qual será a forma de pagamento? 
      [1] Dinheiro ou Cheque
      [2] Cartão à vista
      [3] Cartão em 2x
      [4] Cartão em 3x ou +''')
formaPagamanto = int(input('Sua opção: '))


if formaPagamanto == 1:
    valorFinal = valorCompra * 0.9
    print(f'Pagamento à vista no dinheiro/cheque tem direito a um desconto de 10%!')
elif formaPagamanto == 2:
    valorFinal = valorCompra * 0.95
    print(f'Pagamento à vista no dinheiro/cheque tem direito a um desconto de 5%!')
elif formaPagamanto == 3:
    valorFinal = valorCompra
elif formaPagamanto == 4:
    valorFinal = valorCompra * 1.2
    parcelas = int(input('Quantas parcelas? '))
    valorParcelado = valorFinal / parcelas
    print(f'Sua compra será parcelada em {parcelas}x de R${valorParcelado:.2f} COM JÚROS')
else:
    print(f'Forma de Pagamento inválida, tente novamente!')
    valorFinal = valorCompra
print(f'Sua compra de R${valorCompra:.2f} vai custar R${valorFinal:.2f} no final.')
