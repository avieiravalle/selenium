package Steps;

import java.io.IOException;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos m = new Metodos();
   String Evidencia;
	
	@Given("que o usuario acesse o {string}")
	public void que_o_usuario_acesse_o(String site) throws IOException {
		m.acessarPlataforma(site);
	}

	@When("preencher o campo de busca com o Produto {string}")
	public void preencher_o_campo_de_busca_com_o_produto(String produto) throws IOException, InterruptedException {
	m.realizarBuscaProduto(produto);
		
		
	}

	@Then("valido retorno do produto")
	public void valido_retorno_do_produto() throws IOException {
		m.screnShoot("./Evidencia/" + Evidencia + ".png");
		m.fecharBrowser("Fechar navegador");
	}

}
