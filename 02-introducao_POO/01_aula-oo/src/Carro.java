public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;

    void calcularValorRefenda() {
        System.out.printf("Calcular valor de revenda de: %s %d\n", modelo, anoFabricacao);
    }
}
