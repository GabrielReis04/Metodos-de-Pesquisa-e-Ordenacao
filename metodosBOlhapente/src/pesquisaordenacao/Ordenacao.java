/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesquisaordenacao;

import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class Ordenacao {
    public static void bolha(ArrayList<Aluno>lista){
        Aluno tmp;
        boolean houveTroca;
        int i;
        
        do{
            houveTroca = false;
            for (i=0 ; i<lista.size()-1 ; i++){
                if (lista.get(i).compareTo(lista.get(i+1)) > 0){
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i+1));
                    lista.set(i+1,tmp);
                    houveTroca = true;
                    
                }
            }
        } while(houveTroca);
        
        
    }
    
    public static void pente(ArrayList<Aluno>lista){
        Aluno tmp;
        boolean houveTroca;
        int i;
        int distancia = lista.size();
        
        do{
            distancia = (int)(distancia /1.3);
            if (distancia < 1 ) 
                distancia = 1;
            
            houveTroca = false;
            for (i=0 ; i+distancia<lista.size() ; i++){
                if (lista.get(i).compareTo(lista.get(i+distancia)) > 0){
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i+distancia));
                    lista.set(i+distancia,tmp);
                    houveTroca = true;
                    
                }
            }
        } while(distancia>1 || houveTroca);
        
        
    }
}
