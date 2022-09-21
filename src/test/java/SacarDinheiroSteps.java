import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

import static org.junit.Assert.*;

public class SacarDinheiroSteps {
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

    @Given("a quantidade de saques diários $quantidadeSaques for menor que o limite diário")
    @Alias("a quantidade de saques diários <quantidadeSaques> for menor que o limite diário")
    public void setQuantidadeSaquesMenor(int quantidadeSaques) {
        conta.setSaques(quantidadeSaques);
    }

    @When("o dono da conta retirar $valorRetirado")
    @Alias("o dono da conta retirar <valorRetirado>")
    public void setValorRetirado(double valorRetirado) {
        conta.sacar(valorRetirado);
    }

    @When("a quantidade de saques diários $quantidadeSaques for maior ou igual ao limite diário")
    @Alias("a quantidade de saques diários <quantidadeSaques> for maior ou igual ao limite diário")
    public void setQuantidadeSaquesMaiorIgual(int quantidadeSaques) {
        conta.setSaques(quantidadeSaques);
    }

    @Then("o saldo da conta deve ser $saldoEsperado")
    @Alias("o saldo da conta deve ser <saldoEsperado>")
    public void validarSaldo(double saldoEsperado) {
        assertEquals(saldoEsperado, conta.getSaldo(), 0.0);
    }

    @Then("a operacao deve ser $valido")
    @Alias("a operacao deve ser <valido>")
    public void validarOperacao(boolean valido) {
        boolean condicao = conta.getSaques() >= Conta.getLimiteSaquesDiarios();
        assertFalse(condicao == valido);
    }
}
