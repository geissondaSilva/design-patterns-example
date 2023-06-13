package br.geisson.financiamento.entidades;

import java.time.LocalDate;

public class Veiculo {

    private Double valor;
    private Integer ano;
    private String modelo;
    private String marca;

    private VeiculoTipo tipo;

    private VeiculoPorte porte;

    public Veiculo(Double valor, Integer ano, String modelo, String marca, VeiculoTipo tipo, VeiculoPorte porte) {
        this.valor = valor;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.porte = porte;
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
