package br.geisson.financiamento.entidades;

/**
 * <p>A classe veiculo Builder segue o padrão criacional Builder</p>
 * <ul>
 *     <li>Dimunui a complexidade de criação de objetos deixando menos custoso</li>
 * </ul>
 */
public class VeiculoBuilder {

    public Veiculo hatch(Double valor, Integer ano, String modelo, String marca) {
        return new Veiculo(valor, ano, modelo, marca, VeiculoTipo.PASSEIO, VeiculoPorte.PEQUENO);
    }

    public Veiculo sedan(Double valor, Integer ano, String modelo, String marca) {
        return new Veiculo(valor, ano, modelo, marca, VeiculoTipo.PASSEIO, VeiculoPorte.MEDIO);
    }
}
