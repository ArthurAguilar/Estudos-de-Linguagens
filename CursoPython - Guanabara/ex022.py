nome = str(input('Digite o seu nome completo: '))
separa = nome.split()

print(f'''Analisando seu nome...
Seu nome em maiúsculas é {nome.upper()} 
Seu nome em minúsculas é {nome.lower()}
Seu nome tem ao todo {len(nome)-nome.count(' ')} letras
Seu primeiro nome é {separa[0]} e ele tem {nome.find(' ')} letras
''')