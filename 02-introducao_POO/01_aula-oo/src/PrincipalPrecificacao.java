public class PrincipalPrecificacao {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.precoCusto = 100;
        double precoCompraFornecedor = 140;
        Produto.custoEmbalagem = 10;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preço de venda: %.2f%n", produto.precoVenda);
    }
}
