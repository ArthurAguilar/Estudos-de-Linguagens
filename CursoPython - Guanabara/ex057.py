sexo = str(input('Informe seu sexo (M/F): ')).upper().strip()

while sexo not in 'MF':
    sexo = str(input('Dados inválidos. Por favor, tente novamente! (M/F): ')).upper()

if sexo == 'M':
    print(f'Sexo M registrado com sucesso!')
elif sexo == 'F':
    print(f'Sexo F registrado com sucesso!')
