import java.util.ArrayList;
import java.util.List;

public class Util {
    /*
    *
    *
    */
    // Método para gerar uma lista de alunos aleatórios
    public static List<Aluno> gerarAlunos(int quantidade) {
        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            alunos.add(Aluno.gerarAluno());
        }

        return alunos;
    }

    // Método para exibir uma lista de alunos
    public static void exibir(List<Aluno> lista, String frase) {
        System.out.println(frase);
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }
    }
}
