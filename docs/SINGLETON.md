# Padrão Singleton

Este padrão é utilizado quando precisamos ter uma instância única do nosso objeto na aplicação.
Ela pode ser utilizada para ecominia de memória quando os objetos daquela instância não precisam se repitir.
Um exemplo prático do seu uso é uma classe responsável para exibição de Logs da aplicação,
onde preciso de apenas um objeto na aplicação.
Já uma classe ``Pessoa`` por exemplo pode ser repetir diversas vezes enquanto a aplicação estiver rodando.

Veja o exemplo da classe [LogManager](/src/main/java/br/geisson/log/LogManager.java) 
onde foi implementado apenas uma instância deste objeto para ser utilizado em toda a aplicação. 