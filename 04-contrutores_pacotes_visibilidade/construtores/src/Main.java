public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Picanha 1kg (peça)", 50);
        System.out.println(produto.nome);
        System.out.println(produto.quantidadeEstoque);
    }
}