package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;
import br.geisson.financiamento.FinancimanentoMensagem;

public class ItauFinanciamento implements FinanceiraFactory {

    @Override
    public String possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return FinancimanentoMensagem.INDISPONIVEL;
    }

}
