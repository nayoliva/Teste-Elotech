package testes;
import junit.framework.*;
import elotech.Exercicio2;

import static junit.framework.TestCase.assertEquals;
/**
 *
 * @author Nayara Oliva Ferreira
 */
public class TesteExercicio2 extends TestCase  {
    public void testeEscada5Degraus() {       
        String escada = Exercicio2.escada(5);
        assertEquals("<html><body><div width='200px' align='right'>#<br />##<br />###<br />####<br />#####<br /></div></body></html>", escada);
    }
}
