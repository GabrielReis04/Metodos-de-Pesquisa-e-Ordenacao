package ArquivoAleatorios;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Classe com métodos estáticos para manipulação de listas de números inteiros.
 * Esta classe fornece funcionalidades para popular listas com números aleatórios,
 * escrever listas em arquivos (substituindo o conteúdo existente) e ler números de arquivos.
 */
public class Numeros {
    /**
     * Popula uma lista com números inteiros aleatórios dentro de um intervalo especificado.
     * A lista é limpa antes de adicionar os novos números para garantir que não haja números antigos.
     *
     * @param lista   A lista a ser populada com números inteiros aleatórios.
     * @param qtd     A quantidade de números a serem gerados e adicionados à lista.
     * @param limite  O intervalo máximo (exclusivo) para os números gerados.
     */
    public static void popularAleatorio(ArrayList<Integer> lista, int qtd, int limite) {
        Random gerador = new Random();
        lista.clear(); // Limpar a lista para garantir que não haja números antigos
        for (int i = 0; i < qtd; i++) {
            lista.add(gerador.nextInt(limite));
        }
    }
    
    /**
     * Exibe os números contidos em uma lista no console.
     *
     * @param lista A lista de números inteiros a ser exibida.
     */
    public static void exibir(ArrayList<Integer> lista) {
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    /**
     * Escreve os números de uma lista em um arquivo, substituindo o conteúdo existente.
     * Se o arquivo não existir, ele será criado.
     *
     * @param lista        A lista de números inteiros a serem escritos no arquivo.
     * @param nomeArquivo  O nome do arquivo onde os números serão escritos.
     */
    public static void escreverNoArquivo(ArrayList<Integer> lista, String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo ja existe.");
            }
            
            // Usar FileWriter com o modo de substituição (não append)
            try (FileWriter escritor = new FileWriter(arquivo, false)) { // false para sobrescrever
                for (int numero : lista) {
                    escritor.write(numero + System.lineSeparator());
                }
                System.out.println("Numeros escritos no arquivo com sucesso!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar ou escrever no arquivo: " + e.getMessage());
        }
    }
    
    /**
     * Lê números de um arquivo de texto e os exibe no console.
     *
     * @param caminho O caminho do arquivo de onde os números serão lidos.
     */
    public static void lerDoArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            System.out.println("Numeros lidos do arquivo:");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
