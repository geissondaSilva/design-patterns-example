package br.geisson.financiamento;

import br.geisson.entidades.Pessoa;
import br.geisson.entidades.Veiculo;
import br.geisson.exceptions.MessageException;

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
        return pessoa.getIdade();
    }

    public Double getEntrada() {
        return entrada;
    }

    public void setEntrada(Double entrada) {
        if (entrada > veiculo.getValor()) {
            throw new MessageException("A valor da entrada não deve ser maior que do veiculo!");
        }
        this.entrada = entrada;
    }
}
