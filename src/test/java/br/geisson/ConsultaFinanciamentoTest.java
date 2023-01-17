package br.geisson;

import br.geisson.financiamento.entidades.Pessoa;
import br.geisson.financiamento.entidades.Veiculo;
import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinancimanentoMensagem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Month;

@DisplayName("Valida as informações da consulta de financiamento")
public class ConsultaFinanciamentoTest {

    @Test
    @DisplayName("Veirifica a consistencia para a pessoa que não declarou renda")
    public void consiteRendaNaoDeclarada() {
        ConsultaFinanciamento consultaFinanciamento = new ConsultaFinanciamento(getGeisson(), getGol());
        String mensagem = consultaFinanciamento.validate();
        assertEquals(FinancimanentoMensagem.RENDA_NAO_DELARADA, mensagem);
    }

    @Test
    @DisplayName("Verifica se a pessoa esta com a renda válida")
    public void consisteRendaValida() {
        Pessoa pessoa = getGeisson();
        pessoa.setRendaMensal(1000D);
        ConsultaFinanciamento consultaFinanciamento = new ConsultaFinanciamento(pessoa, getGol());
        String mensagem = consultaFinanciamento.validate();
        assertNotEquals(FinancimanentoMensagem.RENDA_NAO_DELARADA, mensagem);
    }

    private Pessoa getGeisson() {
        return new Pessoa("Geisson", LocalDate.of(1999, Month.SEPTEMBER, 28));
    }

    private Veiculo getGol() {
        return new Veiculo(30.000D, 2012, "Gol", "Wolksvagem");
    }
}
