/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import elotech.Exercicio5;
import junit.framework.*;
import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class TesteExercicio5 extends TestCase {

    public void testeAchaUmaOcorrencia() {
        int repeticoes = Exercicio5.contaPalavras("Elotech", "tech");
        assertEquals(1, repeticoes);
    }

    public void testeAchaNenhumaOcorrencia() {
        int repeticoes = Exercicio5.contaPalavras("Elotech", "n");
        assertEquals(0, repeticoes);
    }
}
