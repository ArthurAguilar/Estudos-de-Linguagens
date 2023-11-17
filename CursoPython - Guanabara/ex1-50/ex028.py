import random
import time

jogarNovamente = "S"

while jogarNovamente == "S":
    pcEasy = random.randint(0,5)
    pcMedium = random.randint(0,10)
    pcHard = random.randint(0,15)

    dificuldade = str(input('Qual dificildade de jogo você deseja? ("E", "M" ou "H") ')).lower()

    if dificuldade == "e":
        print("=-=" * 20)
        print('Vou pensar em um número entre 0 e 5. Tente adivinhar!!')
        print("=-=" * 20)

        time.sleep(1.5)
        n = int(input('Em que número eu pensei? '))
        print("=-=" * 20)

        print('Processando')
        time.sleep(1.5)

        if n == pcEasy:
            print(f'Parabéns! Eu realmente pensei no número {pcEasy} e você conseguiu me vencer!')
        else:
            print(f'Você errou! Eu pensei no número {pcEasy}. Tente novamente!')
    elif dificuldade == "m":
        print("=-=" * 20)
        print('Vou pensar em um número entre 0 e 10. Tente adivinhar!!')
        print("=-=" * 20)
        
        time.sleep(1.5)
        n = int(input('Em que número eu pensei? '))
        print("=-=" * 20)

        print('Processando')
        time.sleep(1.5)

        if n == pcMedium:
            print(f'Brabo! Eu realmente pensei no número {pcMedium} e você conseguiu me vencer!')
        else:
            print(f'Vishh! Eu pensei no número {pcMedium}. Tente novamente!')
    elif dificuldade == "h":
        print("=-=" * 20)
        print('Vou pensar em um número entre 0 e 15. Tente adivinhar!!')
        print("=-=" * 20)

        time.sleep(1.5)
        n = int(input('Em que número eu pensei? '))
        print("=-=" * 20)

        print('Processando')
        time.sleep(1.5)

        if n == pcHard:
            print(f'Tirou onda! Eu realmente pensei no número {pcHard} e você conseguiu me vencer!')
        else:
            print(f'Se fud&#! Eu pensei no número {pcHard}. Tente novamente!')
    else:
        print('Dificuldade inexistente, tente novamente!')

    print("=-=" * 20)
    jogarNovamente = str(input('Deseja jogar novamente? ("S" ou "N") ')).upper()
print("=-=-=-=-=-=-=-=-=-=-=-=-=  FIM  =-=-=-=-=-=-=-=-=-=-=-=-=-=")
