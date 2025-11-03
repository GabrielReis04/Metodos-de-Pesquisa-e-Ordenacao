/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesquisaordenacao;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author laboratorio
 */
public class Principal2 {
    public static void main(String[] args) {
        
    
        ArrayList<Integer> listaPente = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();

        Random gerador = new Random();
        int numero;
        for (int i=0 ; i<60000 ; i++){
            numero = gerador.nextInt(10000);
            listaPente.add(numero);
            lista.add(numero);
        }
        System.out.println("Iniciando pente...");
        System.out.println("Iniciando sort...");
            
    }             
}
