import random
import string
import threading

class Aluno:
    """Classe Aluno com nome e idade."""

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    #__repr__ é semelhante ao to String. Define como os alunos serão representados quando impressos
    def __repr__(self):  
        return f"Aluno(nome={self.nome}, idade={self.idade})"

    @staticmethod
    def gerar_aluno():
        """Gera um aluno com nome e idade aleatórios.
        Args 
            - nome: Cria um nome aleatório de 5 a 10 caracteres a partir do alfabeto e randomiza as palavras.
            - idade: Cria uma idade aleatória entre 18 e 70 anos.
        string.ascii_lowercase: uma string contendo todas letras minúsculas
        - random.choises: seleciona aleatoriamente letras da string string.ascii_lowercase
        - k=random.randit(5,10): a quantidade de letras aleatórias escolhias varia entre 5 e 10
        - ''.join(...): concatena a lista de letras em uma única string
        - .capitalize: Converte a primeira letra para maiúscula e deixa as demiais minúsculas 
        """
        nome = ''.join(random.choices(string.ascii_lowercase, k=random.randint(5, 10))).capitalize() 
        idade = random.randint(18, 70)
        return Aluno(nome, idade)

class Util:
    """Classe com métodos estáticos para geração e manipulação de listas e arquivos."""

    @staticmethod
    def gerar_alunos(lista, quantidade):
        """Popula uma lista com Alunos com nomes e idades aleatórios.

        Args:
            lista (list): Lista onde os alunos serão armazenados.
            quantidade (int): Quantidade de alunos a serem gerados.
        """
        for _ in range(quantidade):
            lista.append(Aluno.gerar_aluno())
        
    # @staticmethod 
    # def exibir(lista, frase):
        """ Metodoque exibe os nomes
        """
    #     print(frase)
    #     for item in lista:
    #         print(item)
            