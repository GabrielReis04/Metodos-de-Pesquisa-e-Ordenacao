package numeros;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
	/*
	 * metodo de classe que popula aleatroriamente uma lista com numeros inteiros
	 * */
	public static void popularListaNumerosAleatorios(ArrayList<Integer> lista, int quantidade, int inicio, int fim){
		Random gerador = new Random();
		int numero;
		for(; quantidade > 0; quantidade--) {
			numero = gerador.nextInt(inicio, fim);
			lista.add(numero);
		}
	}
	
	public static void exibirListaNumeros(ArrayList<Integer> lista) {
		
		for(Integer item : lista) {
			System.out.println(item);
		}
	}
	
	public static void popularListaPalavrasAleatorio(ArrayList<String> lista, int quantidade, int tamanho) {
		Random gerador = new Random();
		String palavraGerada;
		char letraSorteada;
		int posicao;
		
		String letras = "abcdefghijklmnopqrstuvwxyz";
		for (; quantidade> 0; quantidade--) {
			palavraGerada = "";
			for(int i = 0; i < tamanho; i++) {
				posicao = gerador.nextInt(letras.length());
				letraSorteada = letras.charAt(posicao);
				palavraGerada += letraSorteada;
				
			}
			lista.add(palavraGerada);
		}
	}
	
	public static void exibirListaPalavras(ArrayList<String> lista) {
		for( String item: lista) {
			System.out.println(item);
		}
	}
	
    public static void popularListaNumerosArquivo(ArrayList<Integer> lista, String nomeArquivo) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter escritor = new BufferedWriter(arquivo);

            for (int numero : lista) {
                escritor.write(numero + "");
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Números salvos no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os números: " + e.getMessage());
        }
    }

    
    public static void popularListaPalavrasArquivo(ArrayList<String> lista, String nomeArquivo) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter escritor = new BufferedWriter(arquivo);

            for (String palavra : lista) {
                escritor.write(palavra);
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Palavras salvas no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar as palavras: " + e.getMessage());
        }
    }
}


