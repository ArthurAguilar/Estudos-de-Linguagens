import random

x = str(input('Primeiro aluno: '))
y = str(input('Segundo aluno: '))
w = str(input('Terceiro aluno: '))
z = str(input('Quarto aluno: '))
lista = [x, y, w, z]
resultado = random.choice(lista)

print(f'O aluno escolhido foi {resultado}.')