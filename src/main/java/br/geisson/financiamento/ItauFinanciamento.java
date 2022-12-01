package br.geisson.financiamento;

import br.geisson.entidades.Pessoa;

public class ItauFinanciamento implements FinanceiraFactory {

    @Override
    public Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        return false;
    }

}
