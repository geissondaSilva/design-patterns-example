package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;

public class BradescoFinanciamento implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return false;
    }
}
