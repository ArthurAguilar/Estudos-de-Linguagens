import random ## Ficou bem diferente do professor, mas tá valendo! 
computador = random.randint(0, 10)

print(f'''Sou seu computador...
Acabei de pensar em um número entre 0 e 10.
Será que você consegue adivinhar qual foi!?''')
palpite = int(input('Qual é o seu palpite? '))

tentativas = 1
while palpite != computador:
    if palpite < computador:
        print('É maior... tente novamente!')
        palpite = int(input('Qual é o seu palpite? '))
    else:
        print('É menor... tente novamente!')
        palpite = int(input('Qual é o seu palpite? '))
    tentativas += 1

print(f'\nParabéns! Você acertou com {tentativas} tentativa(s).')