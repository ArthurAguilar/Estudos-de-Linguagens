m = float(input('Digite a distância em metros: '))
km = m / 1000
hm = m / 100
dam = m / 10
dm = m * 10
cm = m * 100
mm = m * 1000

print(f''' O valor digitado em metros({m}m) corresponde a:
    Kilômetros = {km} km
    Hectômetro = {hm} hc
    Decâmetro = {dam} dam
    Decímetro = {dm} dm
    Centímetros = {cm} cm
    Milímetros = {mm} mm
''')
