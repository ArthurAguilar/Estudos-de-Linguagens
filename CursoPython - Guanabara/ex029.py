# Valor da multa será de 7 reais por cada km/h acima do limite

vel = int(input('Qual a velocidade atual do carro? '))
multa = (vel - 80) * 7

if vel <= 40:
    print('Bora, doido! Tá segurando o trânsito aí!')
elif vel <= 80:
    print('Tenha um bom dia! Dirija com segurança!')
else:
    print(f'''VOCÊ FOI MULTADO! Você excedeu o limite de 80km/h.
Você deve pagar uma multa de R${multa:.2f}!''')
