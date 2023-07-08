largura = float(input('Digite a largura da parede: '))
altura = float(input('Digite a altura da parede: '))
m2 = largura * altura
qtdTinta = m2 / 2 ## Serão 2litros para cada metro quadrado.

print(
f'''
Sua parede tem a dimensão de {largura}x{altura} e sua área é de {m2:.3f}m².
Para pintá-la, será necessário {qtdTinta:.2f}l de tinta.
''')
