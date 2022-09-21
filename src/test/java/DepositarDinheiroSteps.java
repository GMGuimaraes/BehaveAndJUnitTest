import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DepositarDinheiroSteps {
    private Conta conta;
    private String nome;

    @Given("que o nome inserido é $nome")
    @Alias("que o nome inserido é <nome>")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Given("o valor inicial é $saldoInicial")
    @Alias("o valor inicial é <saldoInicial>")
    public void criarConta(double saldoInicial) {
        Random numero = new Random();
        conta = new Conta(nome, 1 + numero.nextInt(9999), saldoInicial);
    }

    @Given("a opção selecionada é $opcao")
    @Alias("a opção selecionada é <opcao>")
    public void setOpcao(int opcao) {
        //  this.opcao = opcao;
    }

    @When("o cliente depositar $valorDepositado")
    @Alias("o cliente depositar <valorDepositado>")
    public void depositarDinheiro(double valorDepositado) {
        conta.depositar(valorDepositado);
    }

    @Then("o saldo da conta deve ser $saldoEsperado")
    @Alias("o saldo da conta deve ser <saldoEsperado>")
    public void validarSaldo(double saldoEsperado) {
        assertEquals(saldoEsperado, conta.getSaldo(), 0.0);
    }
}
