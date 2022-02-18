/**
 * 
 */
package questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Thiago da Silva Moraes
 *
 */
class SenhaForteTest {

	@Test
    void testSenhaSegura() {
        assertTrue(Senha.validaSenha("tY8+(r"));
    }
	
	@Test
    void testSenhaInsegura() {
        assertFalse(Senha.validaSenha("qw91df354V"));
    }

}
