package br.geisson.financiamento;

public class SantanderFinanceira implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return financiamento.getIdadePessoa() < 18 && financiamento.getTempoUso() > 10;
    }

}
