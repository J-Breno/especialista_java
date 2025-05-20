package com.github.jbreno.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero, double saldo, double valorTotalRendimentos) {
        super(titular, agencia, numero, saldo);
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimento(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }
}
