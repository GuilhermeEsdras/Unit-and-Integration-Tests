package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import Classes.Doador;

public class TesteDoador {
	
//	Testes Parte 1
	
	
	@Test
	public void testeNome() {
//		FIXTURE
		Doador d = new Doador();
		String nome1 = "Joao Paulo";
		String nome2 = "Pedro Paulo";
		
//		Metodo
		d.setNome(nome1);
		
//		Assert
		assertEquals(d.getNome(), "Joao Paulo");
		assertNotEquals(d.getNome(), nome2);
		
//		Modificando atributo e fazendo outro teste
		d.setNome(nome2);
		
//		Assert
		assertEquals(d.getNome(), "Pedro Paulo");
		assertNotEquals(d.getNome(), "pedro paulo");	
	}
	
	@Test
	public void testeIdade() {
//		FIXTURE
		Doador d = new Doador();
		
//		Metodo
		d.setIdade(22);
		
//		Assert
		assertEquals(d.getIdade(), 22);
//		Metodo
		d.setIdade(23);
		
//		Assert
		assertNotEquals(d.getIdade(), 22);
		assertEquals(d.getIdade(), 23);
	}
	
	@Test
	public void testePeso() {
//		FIXTURE
		Doador d = new Doador();
		
//		Metodo
		d.setPeso(55);
		
//		Assert
		assertEquals(d.getPeso(), 55.0, 0);
		
//		Metodo
		d.setPeso(62.66);
		
//		Assert
		assertNotEquals(d.getPeso(), 55.0, 0);
		assertEquals(d.getPeso(), 62.66, 0);
	}
	
	
}
