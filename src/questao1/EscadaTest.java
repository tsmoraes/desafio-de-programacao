/**
 * 
 */
package questao1;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Thiago da Silva Moraes
 *
 */
class EscadaTest {

	@Test
	void testDegrausNegativo() {
		Escada.criaEscada(-2);
		assertEquals(Escada.degraus, -2);
	}

	@Test
	void testZeroDegraus() {
		Escada.criaEscada(0);
		assertEquals(Escada.degraus, 0);
	}

	@Test
	void testUmDegrau() {
		Escada.criaEscada(1);
		assertEquals(Escada.degraus, 1);
	}

	@Test
	void testDezDegraus() {
		Escada.criaEscada(10);
		assertEquals(Escada.degraus, 10);
	}
}