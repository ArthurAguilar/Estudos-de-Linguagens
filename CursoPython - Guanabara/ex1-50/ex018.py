import math
x = float(input('Digite o ângulo que você deseja: '))
seno = math.sin(math.radians(x))
cosseno = math.cos(math.radians(x))
tangente = math.tan(math.radians(x))

print(
f'''
O ângulo de {x} tem o SENO de {seno:.2f}
O ângulo de {x} tem o COSSENO de {cosseno:.2f}     
O ângulo de {x} tem o TANGENTE de {tangente:.2f}      
''')