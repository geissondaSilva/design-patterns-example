package br.geisson.bancos;

import br.geisson.financiamento.ConsultaFinanciamento;
import br.geisson.financiamento.FinancimanentoMensagem;
import br.geisson.financiamento.bancos.BradescoFinanciamento;
import br.geisson.financiamento.entidades.Pessoa;
import br.geisson.financiamento.entidades.Veiculo;
import br.geisson.financiamento.entidades.VeiculoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Month;

@DisplayName("Banco Bradesco")
class BradescoFinanciamentoTest {

    final VeiculoBuilder veiculoBuilder;

    public BradescoFinanciamentoTest() {
        this.veiculoBuilder = new VeiculoBuilder();
    }

    @Test
    @DisplayName("Verifica se a renda é compatível com o valor financiado")
    void verificarRendaPessoa() {
        Pessoa pessoa = new Pessoa("Jorge", LocalDate.of(1999, Month.APRIL, 10));
        pessoa.setRendaMensal(3000D);
        Veiculo veiculo = veiculoBuilder.sedan(50000D, 2012, "Cruze", "Chevrolet");
        ConsultaFinanciamento consulta = new ConsultaFinanciamento(pessoa, veiculo);
        BradescoFinanciamento financiamento = new BradescoFinanciamento();
        assertEquals(FinancimanentoMensagem.RENDA_NAO_COMPATIVEL, financiamento.possuiCreditoPreAprovado(consulta),
                "A renda da pessoa é inferior a 1/10 do valor financiado.");
        pessoa.setRendaMensal(6000D);
        assertEquals(FinancimanentoMensagem.APROVADO, financiamento.possuiCreditoPreAprovado(consulta),
                "A renda da pessoa é superior a 1/10 do valor (5.000).");
    }
}
