package edu.ifpb.br;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import edu.ifpb.br.Classes.Doador;
import edu.ifpb.br.Validadores.ValidarDoador;
import org.junit.Test;


public class TesteValidador
{

    Doador teste = new Doador("Teste", 30, 50.00, 'F', false, false, false, false, false);
    ValidarDoador validador = new ValidarDoador();

    /* TRIAGEM ETAPA 1 */

    @Test
    public void validaIdadeCorreta() {
        // Para doar sangue, é necessário ter entre 16 e 69 anos

        // VÁLIDOS
        teste.setIdade(16);
        assertTrue(validador.validarPrimeiraParte(teste));
        teste.setIdade(59);
        assertTrue(validador.validarPrimeiraParte(teste));

        // INVÁLIDOS
        teste.setIdade(15);
        assertFalse(validador.validarPrimeiraParte(teste));
        teste.setIdade(70);
        assertFalse(validador.validarPrimeiraParte(teste));
    }

    @Test
    public void validaAcimaDe60() {
        // Pessoas acima de 60 anos podem doar, se já tiverem doado sangue alguma vez antes dessa idade

        teste.setIdade(61);

        // VÁLIDO
        teste.setDoador(false);
        assertFalse(validador.validarPrimeiraParte(teste));

        // INVÁLIDO
        teste.setDoador(true);
        assertTrue(validador.validarPrimeiraParte(teste));
    }

    @Test
    public void validaPesoNecessario() {
        // Pesar no mínimo 60 kg se for do sexo masculino e 50 kg se for do sexo feminino

        teste.setSexo('M');
        teste.setPeso(59);
        assertFalse(validador.validarPrimeiraParte(teste));
        teste.setPeso(60);
        assertTrue(validador.validarPrimeiraParte(teste));

        teste.setSexo('F');
        teste.setPeso(49);
        assertFalse(validador.validarPrimeiraParte(teste));
        teste.setPeso(50);
        assertTrue(validador.validarPrimeiraParte(teste));
    }

    /* TRIAGEM ETAPA 2 */

    @Test
    public void testNaoDeveEstarComFebre() {
        teste.setFebre(true);
        assertFalse(validador.validarSegundaParte(teste));

        teste.setFebre(false);
        assertTrue(validador.validarSegundaParte(teste));
    }

    @Test
    public void testNaoDeveEstarGravida() {
        teste.setGravida(true);
        assertFalse(validador.validarSegundaParte(teste));

        teste.setGravida(false);
        assertTrue(validador.validarSegundaParte(teste));
    }

    @Test
    public void testNaoDeveEstarAmamentando() {
        teste.setAmamentando(true);
        teste.setParto(true);
        assertFalse(validador.validarSegundaParte(teste));

        teste.setParto(false);
        assertTrue(validador.validarSegundaParte(teste));
    }
}
