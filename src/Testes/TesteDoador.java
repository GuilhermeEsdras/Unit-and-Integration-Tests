package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Classes.Doador;

public class TesteDoador {
	
	@Test
	public void testeNome() {
//		Criar variaveis
		String nome = "Jo�o Paulo";
		Doador d;
		
//		Instanciar
		d = new Doador();
		d.setNome(nome);
		
//		Testar
		assertEquals(d.getNome(), "Jo�o Paulo");
	}
	
}
