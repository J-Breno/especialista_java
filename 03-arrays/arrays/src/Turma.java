import java.util.Arrays;

public class Turma {
    String identificacao;
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[this.alunos.length - 1] = aluno;
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if(aluno != null) {
                System.out.printf("%s (%d anos)%n" , aluno.nome, aluno.idade);
            }
            else {
                System.out.printf("vago%n");
            }
        }
    }
}
