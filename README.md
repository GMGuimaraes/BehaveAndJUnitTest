# Tópicos em Testes de Software - Exercício 01

## Alunos
- Amanda Vieira Costa
- Fábio Yudi Athagami Masunaga
- Guilherme Moreno Guimarães

## Casos de Uso

### Caso de Uso: Criar Conta
- **Ator Principal**: Cliente
- **Interessados e Interesses**:
  - Cliente: deseja criar uma conta.
- **Pré-condições**: Nenhuma.
- **Pós-condições**: O cliente cria uma conta.

#### Cenário de Sucesso Principal
1. O cliente insere o seu nome.
2. O cliente insere o valor inicial a ser depositado na conta.
3. O cliente cria a sua conta.

#### Fluxos Alternativos
1. O cliente não insere o seu nome. A operação é encerrada.
   <br/>

2. O cliente insere um valor inicial negativo. A operação é encerrada.

### Caso de Uso: Consultar Extrato
- **Ator Principal**: Cliente
- **Interessados e Interesses**:
  - Cliente: deseja consultar o extrato da sua conta.
- **Pré-condições**: O cliente já possui uma conta.
- **Pós-condições**: O cliente consulta o extrato da sua conta.

#### Cenário de Sucesso Principal
1. As opções disponíveis são mostradas ao cliente.
2. O cliente escolhe a opção "Consultar Extrato".
3. O cliente consulta o seu extrato.
4. As opções disponíveis são mostradas ao cliente.
5. O cliente escolhe a opção "Sair".

#### Fluxos Alternativos
Não existem fluxos alternativos para este caso de uso.

### Caso de Uso: Sacar
- **Ator Principal**: Cliente
- **Interessados e Interesses**:
  - Cliente: deseja criar uma conta.
- **Pré-condições**: O cliente já possui uma conta.
- **Pós-condições**: O cliente saca um determinado valor.

#### Cenário de Sucesso Principal
1. As opções disponíveis são mostradas ao cliente.
2. O cliente escolhe a opção "Sacar".
3. O cliente insere o valor a ser sacado.
4. O cliente saca o seu dinheiro.

#### Fluxos Alternativos
2. O cliente realizou mais do que 3 saques no dia. O sistema informa que o
   limite diário de saques foi atingido. As opções disponíveis são mostradas
   novamente ao cliente.
   <br/>

3. O cliente insere um valor a ser sacado maior do que o seu saldo.
4. O sistema informa que o saldo é insuficiente para realizar a operação. As
   opções disponíveis são mostradas novamente ao cliente.
   <br/>

3. O cliente insere um valor negativo a ser sacado. O sistema informa que a
   operação é inválida. As opções disponíveis são mostradas
   novamente ao cliente.

### Caso de Uso: Fazer Deposito
- **Ator Principal**: Cliente
- **Interessados e Interesses**:
  - Cliente: deseja depositar dinheiro em sua conta.
- **Pré-condições**: O cliente já possui uma conta.
- **Pós-condições**: O cliente consulta o extrato da sua conta.

#### Cenário de Sucesso Principal
1. As opções disponíveis são mostradas ao cliente.
2. O cliente escolhe a opção "Depositar".
3. O cliente insere o valor a ser depositado.
4. O cliente deposita o seu dinheiro.

#### Fluxos Alternativos
3. O cliente insere um valor negativo a ser depositado. O sistema informa que a
   operação é inválida. As opções disponíveis são mostradas
   novamente ao cliente.


### Classes de equivalência para Aplicativo: Simulação simples de conta bancária.
#### Sequência de eventos.
<ol>
  <li>Informar o nome</li>
  <li>Informar o Saldo inicial</li>
  <li>Fazer o saque</li>
  <li>Fazer deposito</li>
  <li>Consultar o saldo</li>
  <li>Sair.</li>
</ol>
<table>
<tr><td>Caso de Teste</td></td><td>Cenário</td><td>Nome
</td><td>Valor Inicial
</td><td>Saque</td><td>Deposito</td><td>Consultar extrato</td><td>Saída Esperada</td></tr>
<tr><td>1</td><td>Sequencia Bem Sucedida</td><td>João</td><td>50</td><td>50</td><td>20</td><td>Nome: João Numero da conta: Saldo atual: 20,00 Saques realizados hoje:1</td><td>Nenhuma mensagem de erro</td></tr>
<tr><td>2</td><td>Saca quantia maior que o que possui<td>Vitor</td></td><td>40</td><td>60</td><td></td><td></td><td>Saldo insuficiente. Falha em deposito.</td></tr>
<tr><td>3</td><td>Sacar
 Valores negaitivos</td><td>Abrão</td><td>20</td><td>-10</td><td></td><td></td><td>Impossibilidade de saque e negativo</td></tr>
<tr><td>4</td><td>Depositar
 Valores negaitivos</td><td>Luana</td><td>20</td><td>4</td><td>-5</td><td></td><td>Impossibilidade de deposito negativo</td></tr>
<tr><td>5</td><td>Não informar valor iniciar</td><td></td><td></td><td></td><td></td><td></td><td>Mensagem de erro e reiniciar a tentativa</td></tr>
<tr><td>6</td><td>Não informar
Nome</td><td></td><td></td><td></td><td></td><td></td><td>Mensagem de erro e reiniciar a tentativa</td></tr>
<tr><td>7</td><td>Sacar mais de 5 vezes</td><td></td><td></td><td></td><td></td><td></td><td>Na quinta tentativa:
Limite de saques diarios atingidos.</td></tr>
</table>

#### O teste 3, 4, 5 ,6 e 7 falharam

### Caso 1:
![1](https://user-images.githubusercontent.com/62194953/186047893-f73236dc-a7b9-4ea2-b077-4ff27fc5dc7e.png)

### Caso 4:
![4](https://user-images.githubusercontent.com/62194953/186047999-cc16b280-8cb2-4a76-bb1a-277818bac5a1.png)

### Caso 5:
![5](https://user-images.githubusercontent.com/62194953/186048025-d81055ad-e227-40ce-b109-324a958928e2.png)

