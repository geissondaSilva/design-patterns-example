package br.geisson.entidades;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    private Double rendaMensal;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

}
