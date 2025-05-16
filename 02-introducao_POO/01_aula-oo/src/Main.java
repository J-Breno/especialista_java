public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.modelo = "HRV";
        meuCarro.fabricante = "Honda";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.modelo = "X6";
        seuCarro.fabricante = "BMW";

        System.out.println("Meu carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s\n", meuCarro.modelo);
        System.out.printf("Ano: %d\n", meuCarro.anoFabricacao);

        System.out.println("Seu carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s\n", seuCarro.modelo);
        System.out.printf("Ano: %d\n", seuCarro.anoFabricacao);
    }
}