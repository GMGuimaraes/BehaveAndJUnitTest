Narrative:
As a cliente
I want to sacar um certo valor da minha conta
So that eu tenha uma certa quantia em espécie

Scenario: Cliente saca um valor de sua conta; a quantidade de saques é menor que o limite
Given que o nome inserido é <nome>
And o valor inicial é <saldoInicial>
And a opção selecionada é <opcao>
And a quantidade de saques diários <quantidadeSaques> for menor que o limite diário
When o dono da conta retirar <valorRetirado>
Then o saldo da conta deve ser <saldoEsperado>

Examples:
|nome       |saldoInicial   |quantidadeSaques   |opcao  |valorRetirado  |saldoEsperado  |
|Ana A      |100            |0                  |2      |100            |0              |
|Bob        |100            |1                  |2      |200            |100            |
|Carlos     |100            |2                  |2      |-100           |100            |
|Daniel     |0              |2                  |2      |-100           |0              |

Scenario: Cliente saca um valor de sua conta; a quantidade de saques é igual ou maior que o limite
Given que o nome inserido é <nome>
And o valor inicial é <saldoInicial>
And a opção selecionada é <opcao>
When a quantidade de saques diários <quantidadeSaques> for maior ou igual ao limite diário
Then a operacao deve ser <valido>

Examples:
|nome       |saldoInicial   |opcao  |quantidadeSaques   |valido |
|Ana A      |100            |2      |3                  |false  |
|Bob        |100            |2      |4                  |false  |
