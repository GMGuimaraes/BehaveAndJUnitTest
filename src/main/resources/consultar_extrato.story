//Meta:
Narrative:
As a cliente
I want to consultar o extrato da minha conta
So that eu saiba quanto dinheiro há na minha conta

Scenario: Cliente consulta o extrato de sua conta
Given que o cliente cadastrado é <nome>
And o valor inicial é <saldoInicial>
And o cliente da conta retira <valorRetirado>
And o cliente na conta deposita <valorDepositado>
When o cliente seleciona a opcao <opcao>
Then o saldo mostrado deve ser de <saldoEsperado> e o numero de saques no dia deve ser de <numeroSaques>

Examples:
|nome       |saldoInicial   |opcao   |saldoEsperado  |valorRetirado  |valorDepositado |numeroSaques
|Ana        |500            |1       |450            |100            |50              |1


