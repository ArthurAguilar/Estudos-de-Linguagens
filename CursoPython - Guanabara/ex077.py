palavras = ('Aprender', 'Programar', 'Linguagem', 
            'Python', 'Curso', 'Gratis', 'Estudar',
            'Praticar', 'Trabalhar', 'Mercado', 
            'Programador', 'Futuro')

for v in palavras:
    print(f'\nNa palavra {v.upper()} temos as vogais ', end='')
    for letra in v:
        if letra.lower() in 'aeiou':
            print(f'{letra.upper()}', end=' ') 

