public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepriacao() {

        if(precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. Não foi possível imprimir resumo de depreciação.");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor de revenda: R$ %6.2f%n", calcularValorRefenda());
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if(tempoDeUsoEmAnos >= 10){
            return 0;
        }
        return calcularValorRefenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRefenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if(valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
