import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] notas1 = new Integer[]{8, 5, 4, 9, 10};
        int[] notas2 = {8, 3, 9, 1, 7};

        System.out.println(notas1[2]);

        Arrays.sort(notas2);
        Arrays.sort(notas1, Comparator.reverseOrder());

        String notasEmString = Arrays.toString(notas2);
        System.out.println(notasEmString);

        System.out.println(Calculadora.calcularMedia(notas2));
        System.out.println(Arrays.toString(notas1));

        Turma turma = new Turma();
        turma.identificacao = "Maternal";
        turma.alunos = new Aluno[3];

        turma.alunos[0] = new Aluno();
        turma.alunos[0].nome = "João";
        turma.alunos[0].idade = 2004;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 21;
        turma.alunos[1] = aluno1;

        turma.imprimirListaDeAlunos();
    }
}