public class Produto {

    String nome;
    int quantidadeEstoque;

    Produto () {
    }

    Produto(String nome) {
        this.nome = nome;
    }

    Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
