/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesquisaordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author laboratorio
 */
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Aluno> lista = new ArrayList<>();
    lista.add(new Aluno("Gabriel", 23));
    lista.add(new Aluno("Gabriel", 21));
    lista.add(new Aluno("Gabriel", 12));
    lista.add (new Aluno("Alexandre",50));
    lista.add (new Aluno("Pedro",23));
    lista.add (new Aluno("Pedro",13));
    
    Aluno a = new Aluno("Alexandre", 50);
    
    if (!lista.contains(a)){
        lista.add(a);
    }
    //versao moderna de ordenacao
    //lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getIdade));
    
    //versao tradicional A de ordenacao
    //Collections.sort(lista);
    
    //versao tradicional de ordenacao
    //Collections.sort(lista,Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getIdade));
    
    
    
    Ordenacao.bolha(lista);
    
    for (Aluno item : lista){
    System.out.println(item);
            
        }
    }
    
}
