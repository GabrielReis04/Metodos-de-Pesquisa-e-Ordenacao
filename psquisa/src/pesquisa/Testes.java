/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesquisa;

/**
 *
 * @author laboratorio
 */
class Util{
    public static int contarOcorrencias(String texto,String expressao){
        int ocorrencias = 0;
        String sequencia;
        for (int i=0 ; !expressao.equals("")&& i<=texto.length()-expressao.length(); i++){
            if(expressao.equalsIgnoreCase(texto.substring(i,i+expressao.length()))){
                ocorrencias++;
                //se eu quiser editar a ocorrencia pesquisada:
                //sequencia = texto.substring(i,i+expressao.length());
                //texto=texto.replace(sequencia,sequencia.toUpperCase());
                //System.out.println(texto);
            }
        }
        
        
        return ocorrencias;
    }
}
        
        

public class Testes {
    public static void main(String[] args) {
        String frasePequena ="Turma de pesquisa e ordenacao de isabel rogia";
        String expressao = "isa";
        
        System.out.println(Util.contarOcorrencias(frasePequena,expressao));
    }
}
