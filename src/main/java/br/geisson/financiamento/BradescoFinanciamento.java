package br.geisson.financiamento;

public class BradescoFinanciamento implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return false;
    }
}
