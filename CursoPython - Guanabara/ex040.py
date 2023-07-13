nota1 = float(input('Digite a primeira nota: '))
nota2 = float(input('Digite a segunda nota: '))
media = (nota1 + nota2) / 2

if media < 5:
    print(f'Você está REPROVADO!')
elif media < 6.9:
    print(f'Você está de RECUPERAÇÃO!')
else:
    print(f'Parabéns! Você foi APROVADO!!!')