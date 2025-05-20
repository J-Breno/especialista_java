package com.github.jbreno.banco;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    protected double saldo;

    public Conta(Titular titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0) {
            throw new IllegalArgumentException("Valor saque deve ser maior que 0");
        }

        if(getSaldo() < valorSaque) {
            throw new RuntimeException("Valor insuficiente para saque");
        }

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if(valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor de deposito deve ser maior que 0");
        }

        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agencia: %d\n", getAgencia());
        System.out.printf("Conta: %d\n", getNumero());
        System.out.printf("Titular: %s\n", getTitular().getNome());
        System.out.printf("Saldo: %.2f\n", getSaldo());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Conta{\n");
        builder.append("Titular: ").append(getTitular()).append("\n");
        builder.append("Agencia: ").append(getAgencia()).append("\n");
        builder.append("Numero: ").append(getNumero()).append("\n");
        builder.append("Saldo: ").append(getSaldo()).append("\n");
        builder.append("}");
        return builder.toString();
    }
}
