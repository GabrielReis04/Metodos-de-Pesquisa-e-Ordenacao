import threading
from util import Util
from ordenacao import Ordenacao

# Criar listas de alunos
alunos_bolha = []
alunos_selecao = []
alunos_insercao = []
alunos_sort = []

# Gerar 60000 alunos em cada lista (reduzir para 10000 para testes)
Util.gerar_alunos(alunos_bolha, 10000)
alunos_selecao = alunos_bolha.copy()
alunos_insercao = alunos_bolha.copy()
alunos_sort = alunos_bolha.copy()
# Copia a lista alunos_bolha para as outras listas, para garantir que cada lista comece com os mesmos dados.

# Funções para ordenar usando os diferentes métodos
def ordenar_bolha():
    Ordenacao.bolha(alunos_bolha)
    print("Ordenacao por Bolha concluida.")

def ordenar_selecao():
    Ordenacao.selecao(alunos_selecao)
    print("Ordenacao por Selecao concluida.")

def ordenar_insercao():
    Ordenacao.insercao(alunos_insercao)
    print("Ordenacao por Insercao concluida.")

def ordenar_sort():
    alunos_sort.sort(key=lambda aluno: (aluno.nome, aluno.idade))
    print("Ordenacao com sort do Python concluida.")

# Criação e execução das threads para ordenação
threads = [
    threading.Thread(target=ordenar_bolha),
    threading.Thread(target=ordenar_selecao),
    threading.Thread(target=ordenar_insercao),
    threading.Thread(target=ordenar_sort)
]


# Iniciar as threads
for thread in threads:
    thread.start()

# Aguardar o término de todas as threads para prosseguir
for thread in threads:
    thread.join()

