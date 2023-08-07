package br.geisson.financiamento.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinanceiraFactory;
import br.geisson.financiamento.FinancimanentoMensagem;
import br.geisson.log.LogManager;

public class BradescoFinanciamento implements FinanceiraFactory {

    private final LogManager log = LogManager.getInstance();

    @Override
    public String possuiCreditoPreAprovado(ConsultaFinanciamento financiamento) {
        log.info("Idade da pessoa: " + financiamento.getIdadePessoa());
        if (financiamento.getValorFinanciado() * 0.1D > financiamento.getRendaMensal()) {
            return FinancimanentoMensagem.RENDA_NAO_COMPATIVEL;
        }
        return FinancimanentoMensagem.APROVADO;
    }
}
