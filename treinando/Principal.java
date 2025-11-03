public class Principal {
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Numeros.popularAleatorio(lista,100,1000);
        Numeros.exibir(lista);
    }
}