/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gabriel Reis
 */
public class Principal {
    public static void main(String[] args) {
        // estrutura de dados do tipo HashMap
        HashMap<String, Sessao> sessoes = new HashMap<>();

        //aq  carrego a base de informações
        carregarSessoesDoArquivo(sessoes, "telephony_sessions.txt");

        // 3) Construa um menu
        iniciarMenu(sessoes);
        
        }
    
    
    private static void carregarSessoesDoArquivo(HashMap<String, Sessao> map, String nomeArquivo) {
        System.out.println("Carregando sessoes do arquivo " + nomeArquivo + "...");
        int linhasLidas = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";", 2); 

                if (partes.length == 2) {
                    String numero = partes[0];
                    String dadosJson = partes[1];

                    
                    Sessao novaSessao = new Sessao(numero, dadosJson);

                    
                    map.put(numero, novaSessao);
                    linhasLidas++;
                }
            }
            System.out.println(linhasLidas + " sessoes carregadas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
        System.out.println("");
    }
    
//MENU
    private static void iniciarMenu(HashMap<String, Sessao> sessoes) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Buscar sessao pelo numero de celular");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opcao: ");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                   
                    System.out.print("\nDigite o numero do celular: ");
                    String celularBusca = scanner.nextLine();

                   
                    Sessao sessaoEncontrada = sessoes.get(celularBusca);

                    if (sessaoEncontrada != null) {
                        System.out.println("\nSESSAO ENCONTRADA");
                        
                        System.out.println(sessaoEncontrada.dadosSessao);
                    } else {
                        System.out.println("\nSESSAO NAO ENCONTRADA");
                    }
                    break;

                case "2":
                    System.out.println("Saindo...");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Opcao invalida! Tente novamente..");
            }
        }
    }
}

