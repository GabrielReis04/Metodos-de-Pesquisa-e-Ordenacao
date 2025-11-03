import java.util.Random;

/**
 * Classe Aluno que representa um estudante com nome e idade.
 * <p>
 * Fornece métodos para gerar alunos com atributos aleatórios
 * e para retornar representações em texto desses objetos.
 * </p>
 */
public class Aluno {
    private String nome;
    private int idade;

    /**
     * Construtor da classe Aluno.
     * 
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    /**
     * Método para gerar um aluno com nome e idade aleatórios.
     * 
     * <p>
     * Este método cria um nome aleatório de comprimento variável (entre 5 e 10 caracteres),
     * onde a primeira letra é maiúscula e as outras minúsculas. A idade é gerada
     * aleatoriamente entre 18 e 70 anos.
     * </p>
     * 
     * <p>
     * Uso de StringBuilder para construção eficiente de strings:
     * O StringBuilder modifica diretamente a sequência de caracteres sem criar novos objetos a cada modificação.
     * Ao utilizar uma String diretamente, cada vez que uma nova letra é adicionada, um novo objeto String é criado.
     * </p>
     * 
     * @return Um objeto Aluno com nome e idade aleatórios.
     */
    public static Aluno gerarAluno() {
        Random random = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        int comprimentoNome = 5 + random.nextInt(6); // Gera nomes com comprimento entre 5 e 10 caracteres
        
        // Cria um StringBuilder para construir o nome de forma eficiente
        StringBuilder nomeBuilder = new StringBuilder();

        // Constrói o nome adicionando letras aleatórias
        for (int i = 0; i < comprimentoNome; i++) {
            char letraAleatoria = letras.charAt(random.nextInt(letras.length()));
            nomeBuilder.append(letraAleatoria);
        }

        // Primeira letra maiúscula
        // Converte a primeira letra para maiúscula e mantém o restante em minúsculas
        String nome = nomeBuilder.toString().substring(0, 1).toUpperCase() + nomeBuilder.toString().substring(1);
        
        // Gera uma idade aleatória entre 18 e 70
        int idade = 18 + random.nextInt(53);

        return new Aluno(nome, idade);
    }

    /**
     * Representação textual de um objeto Aluno.
     * 
     * @return Uma string que representa o aluno, contendo seu nome e idade.
     */
    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', idade=" + idade + '}';
    }
}
