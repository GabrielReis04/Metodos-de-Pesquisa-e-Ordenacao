import java.util.Random;

/**
 * Classe com metodos estaticos para manipular listas de numeros
 */

public class Numeros {
    /**
     * metodo estatico que popula uma lista com numeros inteiros e aleatorios num range passado
     * @param lista - lista com numeros inteiros
     * @param qtd - quantidade de numeros a serem gerados na lista
     * @param limite - range no numero gerado
     */
    public static void popularAleatorio (ArrayList lista, int qtd, int limite);{
        Random gerador = new Random();
        for (int i = 0; i<qtd; i++){
            lista.add(gerador.nextInt(limite));
        }

    }
}
