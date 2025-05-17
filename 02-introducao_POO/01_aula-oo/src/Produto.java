public class Produto {
    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    double calcularCustoTotais() {
        return this.precoCusto * Produto.custoEmbalagem;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f\n", Produto.custoEmbalagem);
    }
}
