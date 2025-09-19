#include <iostream>
#include <vector>
#include <cstdlib>  
#include <ctime>    
#include <algorithm> 

using namespace std;

int main() {
    clock_t tempoInicio, tempoFim;
    vector<int> listaAleatoria;
    vector<int> listaSequencial;
    srand(time(0));

    // rotina 1 - popular lista com 100000 números aleatórios entre 100 e 100000
    tempoInicio = clock();
    for (int i = 0; i < 100000; i++) {
        int numero = rand() % (100000 - 100 + 1) + 100;
        listaAleatoria.push_back(numero);
    }
    tempoFim = clock();
    cout << "Tempo para rotina 1 (lista aleatoria): " 
         << (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << " s" << endl;

    // rotina 2 - popular lista sequencial de 0 até 99999
    tempoInicio = clock();
    for (int i = 0; i < 100000; i++) {
        listaSequencial.push_back(i);
    }
    tempoFim = clock();
    cout << "Tempo para rotina 2 (lista sequencial): " 
         << (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << " s" << endl;

    // rotina 3 - ordenar lista aleatória
    tempoInicio = clock();
    sort(listaAleatoria.begin(), listaAleatoria.end());
    tempoFim = clock();
    cout << "Tempo para rotina 3 (ordenar lista aleatoria): " 
         << (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << " s" << endl;

    // rotina 4 - ordenar lista sequencial (já ordenada)
    tempoInicio = clock();
    sort(listaSequencial.begin(), listaSequencial.end());
    tempoFim = clock();
    cout << "Tempo para rotina 4 (ordenar lista sequencial): " 
         << (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << " s" << endl;

    return 0;
}