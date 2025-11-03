class Ordenacao:
    """Classe que contém métodos de ordenação para listas de Aluno."""

    @staticmethod
    def bolha(lista):
        """Ordena a lista de alunos usando o método de bolha por nome e idade.
        No método de bolha, os elementos são trocados (borbulhados) frequentemente até a posição correta para ordenação da lista
        
        - O loop while continua enquanto houver trocas ocorrendo
        - No while, houveTroca é redefinido para False a cada iteração.
        - No for, percorre a lista e compara cada par de elementos e seu próximo (lista[i] e lista[i+1])
        - No if, se os nomes forem iguais, compara a idade
        - Se houve troca, houveTroca é definido como True para indicar que o while deve continuar 
        """
        houveTroca = True
        while houveTroca:
            houveTroca = False
            for i in range(len(lista) - 1):
                if (lista[i].nome > lista[i + 1].nome) or (lista[i].nome == lista[i + 1].nome and lista[i].idade > lista[i + 1].idade):
                    lista[i], lista[i + 1] = lista[i + 1], lista[i]
                    houveTroca = True

    @staticmethod
    def selecao(lista):
        """Ordena a lista de alunos usando o método de seleção por nome e idade.
        No método de seleção, seleciona o n-ésimo menor(ou maior) elemento, troca do n-ésimo menor (ou maior) ekemento com a n-ésima posição da lista.
        É realizada apenas uma troca a cada iteração
        
        - O for externo percorre a lista para encontrar o menor elemento a ser colocado na posição correta.
        Args:
            min_idx: armazena o indice do menor elemento
        - O for interno começa em i+1 e percorre o resto da lista para encontrar o menor elemento
        - No if, compara se o nome do aluno j for menor que o nome no indice min_idx, min_idx é atualizado
        - Se os nomes forem iguais, min_idx é atualizado se o aluno no índice j tiver uma idade menor.
        - O menor elemento é trocado para a posição i
        """
        for i in range(len(lista)):
            min_idx = i
            for j in range(i + 1, len(lista)):
                if (lista[j].nome < lista[min_idx].nome) or (lista[j].nome == lista[min_idx].nome and lista[j].idade < lista[min_idx].idade):
                    min_idx = j
            lista[i], lista[min_idx] = lista[min_idx], lista[i]

    @staticmethod
    def insercao(lista):
        """Ordena a lista de alunos usando o método de inserção por nome e idade.
        No método de inserção, os elementos são ordenados da esquerda para a direita um por vez.
        Pega o segundo elemento e verifica se ele deve ficar antes ou depois da posição atual.
        Assim em diante nos outros elementos.
        - O for começa no segundo elemento (i=1) e percorre toda lista
        - O aux armazena o elemento atual que será inserido na posição correta
        - O j começa em i-1 para encontrar a posição correta para inserir aux.
        - O while compara o aux com os elementos à sua esquerda
            - Se o nome do aluno na posição j for maior que o nome de aux, o elemento do j é movido para direita
            - Se os nomes forem iguais, a comparação é feita com idade
        - O while continua até encontrar a posição correta para inserir aux
        - A inserção é realizada em lista[j+1]
        """
        for i in range(1, len(lista)):
            aux = lista[i]
            j = i - 1
            while j >= 0 and ((lista[j].nome > aux.nome) or (lista[j].nome == aux.nome and lista[j].idade > aux.idade)):
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = aux
