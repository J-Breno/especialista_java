package com.github.Jbreno.cartaobeneficio.servico;

import com.github.Jbreno.cartaobeneficio.Cartao;
import com.github.Jbreno.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
