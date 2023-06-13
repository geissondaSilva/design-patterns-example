# Builder Pattern

Este padrão auxilia na criação de objetos,
onde utilizamos de objetos simples para criação 
de objetos complexos.

Na classe `Veiculo`
temos varias propriedades que precisam ser informados em diversos lugares para permitir criar 
um veiculo sedan por exemplo. Para isso foi implementada a classe `VeiculoBuilder` 
com a função `sedan()` onde ela espera paramêtros simples para criar um objeto complexo.