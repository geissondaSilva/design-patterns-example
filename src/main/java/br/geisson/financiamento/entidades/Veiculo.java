package br.geisson.financiamento.entidades;

import java.time.LocalDate;

public class Veiculo {

    private Double valor;
    private Integer ano;
    private String modelo;
    private String marca;

    public Veiculo(Double valor, Integer ano, String modelo, String marca) {
        this.valor = valor;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Integer getTempoUso() {
        return LocalDate.now().getYear() - ano;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.marca + " - " + this.modelo;
    }
}
