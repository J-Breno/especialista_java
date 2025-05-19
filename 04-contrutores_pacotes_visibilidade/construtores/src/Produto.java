import java.util.Objects;

public class Produto {

    String nome;
    int quantidadeEstoque;

    Produto () {
    }

    Produto(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
    }

    Produto(String nome, int quantidadeEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        if(quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
