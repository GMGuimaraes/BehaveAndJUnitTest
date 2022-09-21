import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ConsultarExtratoSteps {
    private Conta conta;
    private String nome;
    private int opcao;

    @Given("que o cliente cadastrado é $nome")
    @Alias("que o cliente cadastrado é <nome>")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Given("o valor inicial é $saldoInicial")
    @Alias("o valor inicial é <saldoInicial>")
    public void criarConta(double saldoInicial) {
        Random numero = new Random();
        conta = new Conta(nome, 1 + numero.nextInt(9999), saldoInicial);
    }

    @Given("o cliente da conta retira $valorRetirado")
    @Alias("o cliente da conta retira <valorRetirado>")
    public void sacarValor(double valorRetirado) {
        this.conta.sacar(valorRetirado);
    }

    @Given("o cliente na conta deposita $valorDepositado")
    @Alias("o cliente na conta deposita <valorDepositado>")
    public void depositarValor(double valorDepositado) {
        this.conta.depositar(valorDepositado);
    }

    @When("o cliente seleciona a opcao $opcao")
    @Alias("o cliente seleciona a opcao <opcao>")
    public void escolherVerificarExtrato(int opcao) {
        this.opcao = opcao;
    }

    @Then("o saldo mostrado deve ser de $saldoEsperado e o numero de saques no dia deve ser de $numeroSaques")
    @Alias("o saldo mostrado deve ser de <saldoEsperado> e o numero de saques no dia deve ser de <numeroSaques>")
    public void validarExtrato(double saldoEsperado, int numeroSaques) {
        String extratoEsperado =
            "\tEXTRATO" +
            "\nNome: " + this.nome +
            "\nNúmero da conta: " + this.conta.getConta() +
            "\nSaldo atual: " + saldoEsperado +
            "\nSaques realizados hoje: " + numeroSaques + "\n";

        assertEquals(extratoEsperado, this.conta.getExtrato());
    }
}
