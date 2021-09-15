package edu.ifpb.br;

import edu.ifpb.br.Classes.Doador;

import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testeSexo() {
//		FIXTURE
        Doador d = new Doador();

//		Metodo
        d.setSexo('F');

//		Assert
        assertEquals(d.getSexo(), 'F');
        assertNotEquals(d.getSexo(), 'M');

//		alterando
        d.setSexo('M');

//		Assert
        assertEquals(d.getSexo(), 'M');
        assertNotEquals(d.getSexo(), 'F');
        assertNotEquals(d.getSexo(), 'm');

    }

    @Test
    public void testeGravida() {
//		FIXTURE
        Doador d = new Doador();

//		Metodo
        d.setGravida(false);

//		Assert
        assertFalse(d.isGravida());
        assertTrue(!d.isGravida());

//		alterando
        d.setGravida(true);

//		Assert
        assertFalse(!d.isGravida());
        assertTrue(d.isGravida());
    }

    @Test
    public void	testeAmamentando(){
//		FIXTURE
        Doador d = new Doador();

//		Metodo
        d.setAmamentando(false);

//		Assert
        assertFalse(d.isAmamentando());
        assertTrue(!d.isAmamentando());

//		alterando
        d.setAmamentando(true);

//		Assert
        assertFalse(!d.isAmamentando());
        assertTrue(d.isAmamentando());

    }

    @Test
    public void testeParto() {

    }
//
//	@Test
//	public void testeDoador() {
//
//	}
//
//	@Test
//	private void testeFebre() {
//
//	}

}
