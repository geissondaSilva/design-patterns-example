package br.geisson.financiamento.entidades;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private final String nome;
    private final LocalDate dataNascimento;

    private Double rendaMensal;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rendaMensal = 0.0;
    }

    public Integer getIdade() {
        Period period = Period.between(dataNascimento, LocalDate.now());
        return period.getYears();
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
