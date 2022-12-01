package br.geisson.financiamento;

import br.geisson.entidades.Pessoa;

public interface FinanceiraFactory {

    Boolean possuiCreditoPreAprovado(ConsultaFinanciamento financiamento);
}
