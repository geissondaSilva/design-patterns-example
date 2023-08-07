package br.geisson.financiamento;

import br.geisson.exceptions.MessageException;
import br.geisson.financiamento.bancos.BradescoFinanciamento;
import br.geisson.financiamento.bancos.ItauFinanciamento;
import br.geisson.financiamento.bancos.SantanderFinanceira;

public class Financiamento {

    public String consultar(ConsultaFinanciamento pessoa, FinanceiraTipo tipo) {
        FinanceiraFactory financeira;
        try {
            financeira = getTipo(tipo);
        } catch (Exception e) {
            return "Erro ao realizar a consulta: " + e.getMessage();
        }
        return financeira.possuiCreditoPreAprovado(pessoa);
    }

    public FinanceiraFactory getTipo(FinanceiraTipo tipo) {
        switch (tipo) {
            case ITAU -> new ItauFinanciamento();
            case BRADESCO -> new BradescoFinanciamento();
            case SANTANDER -> new SantanderFinanceira();
        }
        throw new MessageException("Financeira não disponível!");
    }
}
