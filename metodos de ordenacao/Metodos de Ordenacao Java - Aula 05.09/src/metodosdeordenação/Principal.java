import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criação das listas de alunos
        List<Aluno> alunosBolha = Util.gerarAlunos(10000);  // 10000 para um teste mais eficiente
        List<Aluno> alunosSelecao = new ArrayList<>(alunosBolha);
        List<Aluno> alunosInsercao = new ArrayList<>(alunosBolha);
        List<Aluno> alunosSort = new ArrayList<>(alunosBolha);

        // Funções para ordenar usando os métodos
        Runnable ordenarBolha = () -> {
            Ordenacao.bolha(alunosBolha);
            System.out.println("Ordenacao por Bolha concluida.");
        };

        Runnable ordenarSelecao = () -> {
            Ordenacao.selecao(alunosSelecao);
            System.out.println("Ordenacao por Selecao concluida.");
        };

        Runnable ordenarInsercao = () -> {
            Ordenacao.insercao(alunosInsercao);
            System.out.println("Ordenacao por Insercao concluida.");
        };

        Runnable ordenarSort = () -> {
            alunosSort.sort((a1, a2) -> {
                int compare = a1.getNome().compareTo(a2.getNome());
                return compare == 0 ? Integer.compare(a1.getIdade(), a2.getIdade()) : compare;
            });
            System.out.println("Ordenacao com sort do Java concluida.");
        };

        // criando threads para ordenação
        Thread threadBolha = new Thread(ordenarBolha);
        Thread threadSelecao = new Thread(ordenarSelecao);
        Thread threadInsercao = new Thread(ordenarInsercao);
        Thread threadSort = new Thread(ordenarSort);

        // Início das threads
        threadBolha.start();
        threadSelecao.start();
        threadInsercao.start();
        threadSort.start();

        // Espera terminar todas as threads
        try {
            threadBolha.join();
            threadSelecao.join();
            threadInsercao.join();
            threadSort.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibindo os 10 primeiros alunos de cada lista ordenada
        Util.exibir(alunosSort.subList(0, 10), "Exibindo os 10 primeiros alunos ordenados (sort Java):");
    }
}
