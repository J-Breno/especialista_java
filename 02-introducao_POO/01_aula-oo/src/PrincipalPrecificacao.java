public class PrincipalPrecificacao {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.precoCusto = 100;
        Produto.custoEmbalagem = 10;
        double custoEmbalagem = 12;

        Produto.alterarCustoEmbalagem(custoEmbalagem);
        Produto.imprimirCustoEmbalagem();

        double percentualMargelLucro = 20;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, percentualMargelLucro);

        System.out.printf("Preço de venda: %.2f%n", produto.precoVenda);
    }
}
