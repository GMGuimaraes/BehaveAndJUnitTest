Narrative:
As a cliente
I want to depositar um certo valor na minha conta
So that eu tenha mais dinheiro na minha conta

Scenario: Cliente deposita um valor na sua conta
Given que o nome inserido é <nome>
And o valor inicial é <saldoInicial>
And a opção selecionada é <opcao>
When o cliente depositar <valorDepositado>
Then o saldo da conta deve ser <saldoEsperado>

Examples:
|nome   |saldoInicial   |opcao  |valorDepositado    |saldoEsperado  |
|Ana    |100            |3      |100                |200            |
|Bob    |100            |3      |-100               |100            |
|Carlos |100            |3      |0                  |100            |