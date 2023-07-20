## Tive certa dificuldade nesse (segundo 'while').. tive que colar um pouco :/
print('='*30)
print('     GERADOR DE PA')
print('='*30)
t1 = int(input('Primeiro termo: '))
razao = int(input('Razão da PA: '))

maisTermos = 10
termo = 1
total = 0
while maisTermos != 0:
    total += maisTermos
    while termo <= total:
        print(f'{t1} -> ', end="")
        t1 += razao
        termo += 1
    print('Pausa')
    maisTermos = int(input('Quantos termos você quer mostrar a mais? '))
print("Fim!")


