package com.github.Jbreno.cartaobeneficio.servico;

import com.github.Jbreno.cartaobeneficio.Cartao;
import com.github.Jbreno.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no pix

        if(valorDeposito <= Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito não pode ser menor que %.2f",
                    Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);
    }

}
