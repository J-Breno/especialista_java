public class Main {
    public static void main(String[] args) {
        int[] notas  = new int[5];
        int[] notas1 = new int[]{8, 5, 4, 9, 10};
        int[] notas2 = {8, 3, 9, 1, 7};

        System.out.println(notas1[2]);

        Calculadora.calcularMedia(notas2);
    }
}