from math import pow

peso = float(input('Digite o seu peso atual: '))
altura = float(input('Digite a sua altura: '))
indiceMC = peso / pow(altura, 2)

print(f'Seu IMC é de {indiceMC:.2f}')
if indiceMC < 18.5:
    print(f'Você está ABAIXO do peso.')
elif indiceMC < 24.9:
    print(f'Você está no PESO IDEAL.')
elif indiceMC < 29.9:
    print(f'Você está SOBREPESO.')
elif indiceMC < 39.9:
    print(f'Você está em estado de OBESIDADE.')
else:
    print(f'Cuidado! Você está em estado de OBESIDADE MÓRBIDA')
    
