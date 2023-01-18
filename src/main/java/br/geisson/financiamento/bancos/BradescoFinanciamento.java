package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;
import br.geisson.financiamento.FinancimanentoMensagem;

public class BradescoFinanciamento implements FinanceiraFactory {

    @Override
    public String possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        if (financiamento.getValorFinanciado() * 0.1D > financiamento.getRendaMensal()) {
            return FinancimanentoMensagem.RENDA_NAO_COMPATIVEL;
        }
        return FinancimanentoMensagem.APROVADO;
    }
}
