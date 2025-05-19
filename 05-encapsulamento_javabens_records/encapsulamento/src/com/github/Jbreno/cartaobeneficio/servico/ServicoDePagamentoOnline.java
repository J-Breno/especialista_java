package com.github.Jbreno.cartaobeneficio.servico;

import com.github.Jbreno.cartaobeneficio.Cartao;
import com.github.Jbreno.cartaobeneficio.Estabelecimento;
import com.github.Jbreno.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
