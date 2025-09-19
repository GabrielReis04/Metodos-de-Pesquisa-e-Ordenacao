import time
import random

import time
import random

tempoInicio = time.time()
listaAleatoria = []
for i in range(100000):
    numero = random.randint(100, 100000)
    listaAleatoria.append(numero)
tempoFim = time.time()
print("Tempo da rotina 1 (popular lista aleatória):", round((tempoFim - tempoInicio), 3), "s")

tempoInicio = time.time()
listaSequencial = []
for i in range(100000):
    listaSequencial.append(i)
tempoFim = time.time()
print("Tempo da rotina 2 (popular lista sequencial):", round((tempoFim - tempoInicio), 3), "s")

tempoInicio = time.time()
listaAleatoria.sort()
tempoFim = time.time()
print("Tempo da rotina 3 (ordenar lista aleatória): ", round((tempoFim - tempoInicio), 3), "s")

tempoInicio = time.time()
listaSequencial.sort()
tempoFim = time.time()
print("Tempo da rotina 4 (ordenar lista sequencial): ", round((tempoFim - tempoInicio), 3), "s")
