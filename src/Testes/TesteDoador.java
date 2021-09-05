package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Classes.Doador;

public class TesteDoador {
	
	@Test
	public void testeNome() {
//		Criar variaveis
		String nome = "João Paulo";
		Doador d;
		
//		Instanciar
		d = new Doador();
		d.setNome(nome);
		
//		Testar
		assertEquals(d.getNome(), "João Paulo");
	}
	
}
