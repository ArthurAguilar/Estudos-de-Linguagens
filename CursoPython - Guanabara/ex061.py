print('='*30)
print('     GERADOR DE PA')
print('='*30)

t1 = int(input('Primeiro termo: '))
razao = int(input('Razão da PA: '))

termo = 1
while termo <= 10:
    print(f'{t1} -> ', end="")
    t1 += razao
    termo += 1
print("Fim!")
