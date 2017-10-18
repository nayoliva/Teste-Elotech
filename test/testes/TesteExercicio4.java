package testes;

import elotech.Exercicio4;
import junit.framework.*;
import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class TesteExercicio4 extends TestCase {

    public void testeTroco1() {
        String troco = Exercicio4.calculaTroco(4, 5);
        assertEquals("Sistema não possibilita realizar troco", troco);
    }
    public void testeTrocoTres() {
        String troco = Exercicio4.calculaTroco(2, 5);
        assertEquals("Sistema não possibilita realizar troco", troco);
    }
     public void testeComTrocoSeis() {
        String troco = Exercicio4.calculaTroco(4, 10);
        assertEquals("3 nota(s) de R$ 2-", troco);
    }
    public void testeComTrocoOito() {
        String troco = Exercicio4.calculaTroco(2, 10);
        assertEquals("4 nota(s) de R$ 2-", troco);
    }
}
