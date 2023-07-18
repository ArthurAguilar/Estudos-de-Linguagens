frase = str(input('Digite uma frase: ')).strip().upper()
fraseInvertida = frase.replace(" ", "")[::-1].strip()

print(f'O inverso de {frase.replace(" ", "")} é {fraseInvertida}')
if frase.replace(" ", "") == fraseInvertida:
    print(f'Portanto, a frase digitada é um palíndromo!')
else:
    print(f'Portanto, a frase digitada NÃO é um políndromo!')
