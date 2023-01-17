package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;

public class ItauFinanciamento implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return false;
    }

}
