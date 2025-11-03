import random
class Numeros:
    """_summary_
    Classe que possui serviços de manipulação de números 
    """
    @staticmethod
    def popular_aleatorio(lista, qtd, limite):
        """_summary_
            Metodo de classe que popula com numeros inteiros uma lista
        Args:
            lista (int): para numeros inteiros
            qtd (int): contem a quantidade de numeros a serem gerados na lista
            limite (int): range do numero
        """
        for i in range(0,qtd):
            lista.append(random.randint(0,limite))
