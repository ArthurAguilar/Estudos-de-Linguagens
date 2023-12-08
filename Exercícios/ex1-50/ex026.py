nome = str(input('Digite seu nome completo: ')).title().strip()
separa = nome.split()

print(f'''Muito prazer em te conhecer!
Seu primeiro nome é {separa[0]}
Seu último nome é {separa[-1]}
''')