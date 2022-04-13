package Metodos;

import java.io.IOException;

import org.openqa.selenium.interactions.Pause;

import Elementos.Elementos;
import Pages.Pages;

public class Metodos extends Pages {
	Elementos e = new Elementos();

	public void acessarPlataforma(String site) throws IOException {
		executarNavegador(site, "CHROME", "Abrindo navegador");

	}

	public void realizarBuscaProduto(String produto) throws IOException, InterruptedException {
		pauser(5000, "pausa");
		escrever(e.getCampoBusca(), produto, "Pesquisar Produto");
		pauser(5000, "pausa");
		clicar(e.getBtnLupa(), "Clicar na lupa");
		

	}
	
	public void validarProduto() {
		
		
		
	}

}
