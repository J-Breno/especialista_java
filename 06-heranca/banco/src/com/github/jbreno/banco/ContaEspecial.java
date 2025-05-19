package com.github.jbreno.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void sacar(double valorSaque) {
        if(valorSaque <= 0) {
            throw new IllegalArgumentException("Valor saque negativo");
        }

        if(getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Valor saque negativo");
        }

        saldo -= valorSaque;
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f\n", getSaldoDisponivel());
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }
}
