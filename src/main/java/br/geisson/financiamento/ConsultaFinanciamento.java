package br.geisson.financiamento;

import br.geisson.entidades.Pessoa;
import br.geisson.entidades.Veiculo;

public class ConsultaFinanciamento {

    private Pessoa pessoa;

    private Veiculo veiculo;

    private Double entrada;

    public ConsultaFinanciamento(Pessoa pessoa, Veiculo veiculo) {
        this.pessoa = pessoa;
        this.veiculo = veiculo;
        entrada = 0.0D;
    }

    public Integer getTempoUso() {
        return this.veiculo.getTempoUso();
    }

    public Integer getIdadePessoa() {
        return 10;
    }
}
