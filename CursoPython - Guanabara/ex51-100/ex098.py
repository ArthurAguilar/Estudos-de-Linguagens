from time import sleep

def contador(i, f, p):
    print(f'Contagem de {i} até {f} de {p} em {p}.')
    
    if i <= f:
        for c in range(i, f+1, p):
            print(c, end=' ', flush=True)
            sleep(.5)
    if i >= f:
        for c in range(i, f-1, -p):
            print(c, end=' ', flush=True)
            sleep(.5)
    print('FIM!')
    print('-'*40)
    
print('-'*40)
contador(1, 10, 1)
contador(10, 0, 2)

print('Agora é sua vez de personalizar a contagem!')
i = int(input('Digite o início da contagem: '))
f = int(input('Digite o final da contagem: '))
p = int(input('Digite o número de pulos: '))
print('-'*40)

contador(i, f, p)
