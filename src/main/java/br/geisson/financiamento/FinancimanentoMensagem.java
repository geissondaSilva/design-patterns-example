package br.geisson.financiamento;

public class FinancimanentoMensagem {

    private FinancimanentoMensagem() throws IllegalAccessException {
        throw new IllegalAccessException("Método não deve ser implementado");
    }

    public static final String INDISPONIVEL = "Banco não está disponível!";

    public static final String APROVADO = "Aprovado!";

    public static final String RENDA_NAO_DELARADA = "A renda não foi declarada!";

    public static final String PESSOA_NAO_INFORMADA = "A pessoa não foi informada!";

    public static final String RENDA_NAO_COMPATIVEL = "A renda não é compativél com o valor financiado!";
}
