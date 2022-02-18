package questao3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

class AnagramasTest {

	@Test
    void testComparaComoAnagramas() {
        assertTrue(Anagramas.comparaAnagramas("ola", "alo"));
    }

    @Test
    void testComparaComoNaoAnagramas() {
        assertFalse(Anagramas.comparaAnagramas("oi", "ioio"));
    }

    @Test
    void testObtemNumeroDeAnagramas() {
        assertEquals(Anagramas.getQuantidadeDeAnagramas("componente"), 6);
        assertEquals(Anagramas.getQuantidadeDeAnagramas("renderizar-se"), 14);
        assertEquals(Anagramas.getQuantidadeDeAnagramas("o mais comum é usar"), 28);
    }

}
