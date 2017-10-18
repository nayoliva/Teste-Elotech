package testes;

import java.util.ArrayList;
import java.util.List;
import junit.framework.*;
import elotech.Exercicio1;

/**
 *
 * @author User
 */
public class TesteExercicio1 extends TestCase {

    public void testeEncontraPrimeiroRepetidoIgualATres() {
        List<Integer> teste = new ArrayList<>();
        teste.add(2);
        teste.add(3);
        teste.add(3);
        teste.add(1);
        teste.add(5);
        teste.add(2);

        int resposta = Exercicio1.primeiroRepetido(teste);

        assertEquals(3, resposta);
    }

    public void testeNaoEncontraRepetido() {
        List<Integer> teste = new ArrayList<>();
        teste.add(2);
        teste.add(4);
        teste.add(3);
        teste.add(5);
        teste.add(1);
        
        int resposta = Exercicio1.primeiroRepetido(teste);

        assertEquals(-1, resposta);
    }
    
    public void testeListaTamanhoIgualAUm (){
        List<Integer> teste = new ArrayList<>();
        teste.add(2);
        
        int resposta = Exercicio1.primeiroRepetido(teste);

        assertEquals(0, resposta);
    
    }
}
