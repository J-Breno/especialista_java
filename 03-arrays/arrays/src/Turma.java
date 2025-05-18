public class Turma {
    String identificacao;
    Aluno[] alunos;

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
