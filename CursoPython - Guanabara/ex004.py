n = input('Digite algo: ')

print(f'''
    O tipo primitivo deste valor é = {type(n)}
    Só tem espaços? {n.isspace()} 
    É um número? {n.isnumeric()}
    É alfabético? {n.isalpha()}
    É alfanumérico? {n.isalnum()}
    Está em maiúsculo? {n.isupper()} 
    Está em minúsculo? {n.islower()}
    Está capitalizada? {n.istitle()}
''')