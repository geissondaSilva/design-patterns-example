### Contexto

É necessário que seja criada um sistema para realizar a consulta de crédito para realizar
a venda de um carro em uma consesionária. A consecionária utiliza de vária financeiras por dispobilizar
crédito para seus clientes. Foi solicitado que seja implementado um sistema onde são informado as informações
do cliente e realize a consulta em sua financeira de preferência.

### Problema

O desenvolvedor no momento de levantar o requisito levantou inicialmente que seria necessário
criar basicamente um código para cada instituição financeira, pois cada uma delas possui regras
diferentes para a aprovação de crédito. Porém o processo de consulta de crédito seria identico para
todos as instituições. Se fosse implementado um código para cada instituição geraria muita duplicidade 
de código e dificuldade de manutenção. Neste caso o desenvolver acionou o Arquiteto de Software 
onde o mesmo propôs a seguinte solução: 

### Resolução

O padrão **método de fabrica** é utilizado para auxiliar na criação de objetos baseando-se apenas a uma única 
interface ou classe aobstrata para ser utilizado em todo a aplicação.
Na classe [FinanceiraFactory](/src/main/java/br/geisson/financiamento/FinanceiraFactory.java) 
implementamos as funções especificas que as subclasses devem implementar, assim adotamos uma padrão de implementação
em todas as nossas classes especificas. Na classe [Financiamento](/src/main/java/br/geisson/financiamento/Financiamento.java)
temos o método `getTipo()` que com base no tipo do financiamento obtemos a implementação classe abstrata que aplica as 
regras especificas do tipo da financeira. Assim podemos implementar em todo o resto da nossa aplicação o seu uso
baseada somente na classe abstrata e não na subclasse, diimunindo a quantidade de instancias de objetos e condições
duplicadas para chamar a subclasse correta.