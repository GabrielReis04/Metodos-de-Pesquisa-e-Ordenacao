import java.util.List;

/**
 * Classe que contém métodos de ordenação para listas de Aluno.
 */
public class Ordenacao {

    /**
     * Ordena a lista de alunos usando o método de bolha por nome e idade.
     * No método de bolha, os elementos são trocados (borbulhados) frequentemente 
     * até a posição correta para ordenação da lista.
     * 
     * - O loop while continua enquanto houver trocas ocorrendo.
     * - No while, houveTroca é redefinido para False a cada iteração.
     * - No for, percorre a lista e compara cada par de elementos e seu próximo (lista[i] e lista[i+1]).
     * - No if, se os nomes forem iguais, compara a idade.
     * - Se houve troca, houveTroca é definido como True para indicar que o while deve continuar.
     * 
     * @param lista Lista de alunos a ser ordenada.
     */
    public static void bolha(List<Aluno> lista) {
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                Aluno a1 = lista.get(i);
                Aluno a2 = lista.get(i + 1);
                if (a1.getNome().compareTo(a2.getNome()) > 0 || 
                    (a1.getNome().equals(a2.getNome()) && a1.getIdade() > a2.getIdade())) {
                    lista.set(i, a2);
                    lista.set(i + 1, a1);
                    houveTroca = true;
                }
            }
        }
    }

    /**
     * Ordena a lista de alunos usando o método de seleção por nome e idade.
     * No método de seleção, seleciona o n-ésimo menor (ou maior) elemento, 
     * troca do n-ésimo menor (ou maior) elemento com a n-ésima posição da lista.
     * É realizada apenas uma troca a cada iteração.
     * 
     * - O for externo percorre a lista para encontrar o menor elemento a ser colocado na posição correta.
     * - O min_idx armazena o índice do menor elemento.
     * - O for interno começa em i+1 e percorre o resto da lista para encontrar o menor elemento.
     * - No if, compara se o nome do aluno j for menor que o nome no índice min_idx, min_idx é atualizado.
     * - Se os nomes forem iguais, min_idx é atualizado se o aluno no índice j tiver uma idade menor.
     * - O menor elemento é trocado para a posição i.
     * 
     * @param lista Lista de alunos a ser ordenada.
     */
    public static void selecao(List<Aluno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < lista.size(); j++) {
                Aluno a1 = lista.get(j);
                Aluno a2 = lista.get(minIdx);
                if (a1.getNome().compareTo(a2.getNome()) < 0 || 
                    (a1.getNome().equals(a2.getNome()) && a1.getIdade() < a2.getIdade())) {
                    minIdx = j;
                }
            }
            Aluno temp = lista.get(i);
            lista.set(i, lista.get(minIdx));
            lista.set(minIdx, temp);
        }
    }

    /**
     * Ordena a lista de alunos usando o método de inserção por nome e idade.
     * No método de inserção, os elementos são ordenados da esquerda para a direita um por vez.
     * Pega o segundo elemento e verifica se ele deve ficar antes ou depois da posição atual.
     * Assim em diante nos outros elementos.
     * 
     * - O for começa no segundo elemento (i=1) e percorre toda a lista.
     * - O aux armazena o elemento atual que será inserido na posição correta.
     * - O j começa em i-1 para encontrar a posição correta para inserir aux.
     * - O while compara o aux com os elementos à sua esquerda.
     * - Se o nome do aluno na posição j for maior que o nome de aux, o elemento do j é movido para a direita.
     * - Se os nomes forem iguais, a comparação é feita com a idade.
     * - O while continua até encontrar a posição correta para inserir aux.
     * - A inserção é realizada em lista[j+1].
     * 
     * @param lista Lista de alunos a ser ordenada.
     */
    public static void insercao(List<Aluno> lista) {
        for (int i = 1; i < lista.size(); i++) {
            Aluno aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && 
                   (lista.get(j).getNome().compareTo(aux.getNome()) > 0 || 
                    (lista.get(j).getNome().equals(aux.getNome()) && lista.get(j).getIdade() > aux.getIdade()))) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }
}
