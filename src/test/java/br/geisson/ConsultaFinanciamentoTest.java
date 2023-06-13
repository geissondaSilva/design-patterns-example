package br.geisson;

import br.geisson.financiamento.entidades.Pessoa;
import br.geisson.financiamento.entidades.Veiculo;
import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinancimanentoMensagem;
import br.geisson.financiamento.entidades.VeiculoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Month;

@DisplayName("Valida as informações da consulta de financiamento")
class ConsultaFinanciamentoTest {

    final VeiculoBuilder veiculoBuilder;

    public ConsultaFinanciamentoTest() {
        this.veiculoBuilder = new VeiculoBuilder();
    }

    @Test
    @DisplayName("Veirifica a consistencia para a pessoa que não declarou renda")
    void consiteRendaNaoDeclarada() {
        ConsultaFinanciamento consultaFinanciamento = new ConsultaFinanciamento(getGeisson(), getGol());
        String mensagem = consultaFinanciamento.validate();
        assertEquals(FinancimanentoMensagem.RENDA_NAO_DELARADA, mensagem);
    }

    @Test
    @DisplayName("Verifica se a pessoa esta com a renda válida")
    void consisteRendaValida() {
        Pessoa pessoa = getGeisson();
        pessoa.setRendaMensal(1000D);
        ConsultaFinanciamento consultaFinanciamento = new ConsultaFinanciamento(pessoa, getGol());
        String mensagem = consultaFinanciamento.validate();
        assertNotEquals(FinancimanentoMensagem.RENDA_NAO_DELARADA, mensagem);
    }

    @Test
    @DisplayName("Checa o calculo do valor a ser financiado")
    void validarValorFinanciado() {
        Pessoa pessoa = getGeisson();
        Veiculo veiculo = veiculoBuilder.hatch(40000D, 2017, "Ka", "Ford");
        ConsultaFinanciamento consultaFinanciamento = new ConsultaFinanciamento(pessoa, veiculo);
        consultaFinanciamento.setEntrada(10000D);
        assertEquals(30000D, consultaFinanciamento.getValorFinanciado(),
                "O valor financiado deve ser 40.000 - 10.000 = 30.000");
    }

    private Pessoa getGeisson() {
        return new Pessoa("Geisson", LocalDate.of(1999, Month.SEPTEMBER, 28));
    }

    private Veiculo getGol() {
        return veiculoBuilder.hatch(30.000D, 2012, "GOL", "Woksvagem");
    }
}
