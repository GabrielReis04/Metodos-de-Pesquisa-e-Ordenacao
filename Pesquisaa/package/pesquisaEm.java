/*
    Pesquisa em:
    - lista ou vetores: dados primitivos ou objetos
        - sequencial
            6   8   4   9   2   5   6   3   9   4
            2   3   4   4   5   6   6   8   9   9
        - arvore
            0   1   2   3   4   5   6   7   8   9   indice
        s    2   3   4   4   5   6   6   8   9   9
    - texto
        - digital, ou seja, digito a digito





 1    3   5   5   5   6   7   9   10  11  45  67  89  90  90
 1    3   5   5   5   6   7   9   10  11  45  67  89  90  90
 

 Bool binaria (int valor, int vetor[], int n) {
    int ini = 0;
    int fim = n-1;
    int meio;

    while (ini <= fim){
        meio = (ini+fim)/2;
        if (valor == vetor[meio]){
            return true;
        }
        if (valor < vetor[meio]){
            fim = meio-1;
        }
        else {
            ini = meio + 1;
        }
    }
 }

*/
