import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pesquisa {

    // Método de busca binária
    public static boolean binaria(int valor, ArrayList<Integer> lista) {
        int ini = 0;
        int fim = lista.size() - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (valor == lista.get(meio)) {
                return true; // Valor encontrado
            }
            if (valor < lista.get(meio)) {
                fim = meio - 1; // Busca na metade esquerda
            } else {
                ini = meio + 1; // Busca na metade direita
            }
        }
        return false; // Valor não encontrado
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random gerador = new Random();
        int qtd = 100000;
        int n = 1000000;

        // Preenche a lista com números aleatórios
        for (int i = 0; i < n; i++) {
            int numeros = gerador.nextInt(qtd);
            lista.add(numeros);
        }

        // Ordena a lista antes de realizar a busca binária
        lista.sort(Integer::compareTo);


        // Marca o tempo inicial
        long tempoInicial = System.nanoTime();

        // Realiza a busca binária
        boolean encontrado = binaria(5, lista); // Exemplo: buscar o valor 5000

        // Marca o tempo final
        long tempoFinal = System.nanoTime();

        long duracao = (tempoFinal - tempoInicial); //converte de nanos para milisegundos

        // Mostra o resultado da busca e o tempo gasto
        System.out.println("Valor encontrado: " + encontrado);
        System.out.println("Tempo gasto (nanosegundos): " + duracao);
    }
}
