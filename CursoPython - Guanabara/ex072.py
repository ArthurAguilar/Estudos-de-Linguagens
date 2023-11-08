num = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 
       'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze',
       'quartoze', 'quinze', 'dezesseis', 'dezessete', 'dezoite',
       'dezenove', 'vinte')

while True:
    n = int(input('Digite um valor entre 0 e 20: '))
    if n < 0 or n > 20:
        print('Tente novamente. ', end='')  
    else:
        print(f'Você digitou o número {num[n]}')  
        break