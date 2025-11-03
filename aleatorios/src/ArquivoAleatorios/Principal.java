package ArquivoAleatorios;

import java.util.ArrayList;

/**
 * Classe principal que demonstra o uso da classe {@link Numeros}.
 * Esta classe cria uma lista de números aleatórios, escreve em um arquivo
 * (substituindo o conteúdo existente) e, em seguida, lê e exibe os números do arquivo.
 */
public class Principal {
  
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Popular a lista com números aleatórios
        Numeros.popularAleatorio(lista, 100, 1000);
        
        // Exibir a lista original
        System.out.println("Lista original:");
        Numeros.exibir(lista);
        
        // Caminho para o arquivo
        String nomeArquivo = "numeros.txt";
        
        // Escrever a lista no arquivo (substituindo o conteúdo existente)
        Numeros.escreverNoArquivo(lista, nomeArquivo);
        
        // Ler os números do arquivo e exibir
        Numeros.lerDoArquivo(nomeArquivo);
    }
}
