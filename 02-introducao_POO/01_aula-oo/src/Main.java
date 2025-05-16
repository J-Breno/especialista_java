public class Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Breno";
        eu.cpf = "000.000.000-12";
        eu.anoNascimento = 2004;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.modelo = "HRV";
        meuCarro.fabricante = "Honda";
        meuCarro.proprietario = eu;

        Pessoa vc = new Pessoa();
        vc.nome = "João";
        vc.cpf = "000.000.000-13";
        vc.anoNascimento = 2004;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.modelo = "X6";
        seuCarro.fabricante = "BMW";
        seuCarro.proprietario = vc;

        System.out.println("Meu carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s\n", meuCarro.modelo);
        System.out.printf("Ano: %d\n", meuCarro.anoFabricacao);
        System.out.printf("Cor: %s\n", meuCarro.cor);
        System.out.printf("Fabricante: %s\n", meuCarro.fabricante);
        System.out.printf("Nome do proprietário: %s\n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s\n", seuCarro.modelo);
        System.out.printf("Ano: %d\n", seuCarro.anoFabricacao);
        System.out.printf("Cor: %s\n", seuCarro.cor);
        System.out.printf("Fabricante: %s\n", seuCarro.fabricante);
        System.out.printf("Nome do proprietário: %s\n", seuCarro.proprietario.nome);
    }
}