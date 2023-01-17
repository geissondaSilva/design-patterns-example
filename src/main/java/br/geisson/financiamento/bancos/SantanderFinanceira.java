package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;

public class SantanderFinanceira implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return financiamento.getIdadePessoa() < 18 && financiamento.getTempoUso() > 10;
    }

}
