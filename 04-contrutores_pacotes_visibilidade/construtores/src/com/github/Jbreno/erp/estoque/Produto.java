package com.github.Jbreno.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {
    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo;
    private String nome;
    private int quantidadeEstoque;

    public Produto () {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    public Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        if(estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }
        this.nome = nome;
        quantidadeEstoque = estoqueInicial;
        this.codigo = gerarCodigo();
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString();
    }
}
