package testes;

import junit.framework.*;
import elotech.Exercicio3;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class TesteExercicio3 extends TestCase {

    public void testeRetiraItemUm() {
        List<Integer> teste = new ArrayList<>();
        teste.add(3);
        teste.add(8);
        teste.add(9);
        teste.add(4);
        teste.add(7);
        teste.add(1);
        teste.add(6);
        teste.add(1);

        String novaLista = Exercicio3.RemoveItem(teste, 1);
        assertEquals("A nova lista é : [3, 8, 9, 4, 7, 6]", novaLista);
    }

    public void testeNumeroNaoExiteNaLista() {
        List<Integer> teste = new ArrayList<>();
        teste.add(3);
        teste.add(8);
        teste.add(9);
        teste.add(4);
        teste.add(7);
        teste.add(1);
        teste.add(6);
        teste.add(1);

        String novaLista = Exercicio3.RemoveItem(teste, 5);
        assertEquals("Número informado não existe na lista", novaLista);
    }

    public void testeListaMaiorQueUm() {
        List<Integer> teste = new ArrayList<>();
        teste.add(3);

        String novaLista = Exercicio3.RemoveItem(teste, 5);
        assertEquals("A lista deve conter mais de um número!", novaLista);
    }
}
