from datetime import date
date = date.today().year
ano = int(input('Ano de nascimento: '))
idade = date - ano
idadeRestante = 18 - idade

print(f'Quem nasceu em {ano} tem {idade} anos de idade em 2023')

if idade < 18:
    print(f'Ainda faltam {idadeRestante} anos para o alistamento')
    print(f'Seu alistamento será em {date + idadeRestante}.')
elif idade == 18:
    print(f'Você está no ano de alistamento.')
else:
    print(f'Você já deveria ter se alistado há {idadeRestante * (-1)} anos')
    print(f'Seu alistamento foi em {date - (idadeRestante * (-1))}.')
      

