x = str(input('Digite uma frase: ')).upper().strip()
letra = str(input('Digite a letra que deseja pesquisar: ')).upper().strip()

print(f'''
A letra {letra} aparece {x.count(letra)} vezes na frase
A primeira letra {letra} apareceu na {x.find(letra)+1}ª posição
A última letra {letra} apareceu na {x.rfind(letra)+1}ª posição.
''')