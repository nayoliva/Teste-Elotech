package elotech;

import javax.swing.JOptionPane;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class Exercicio5 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        String procurarString = JOptionPane.showInputDialog(null, "Digite uma string que deseja encontrar na frase anteriormente informada : ");
        if ((!frase.isEmpty()) && (!procurarString.isEmpty())) {
            int contagem = contaPalavras(frase, procurarString);
            JOptionPane.showMessageDialog(null, "A string '" + procurarString + "' foi encontrada " + contagem + " vez(es) na frase.");
        } else {
            JOptionPane.showMessageDialog(null, "Informações inválidas!");
        }
    }

    public static int contaPalavras(String frase, String procurarString) {
        int pos = -1;
        int contagem = 0;
        while (true) {
            pos = frase.indexOf(procurarString, pos + 1);
            //Quando indexOf não encontra a subtring retorna -1, logo terminou de percorrer a frase
            if (pos < 0) {
                break;
            }
            contagem++;
        }
        return contagem;
    }
}
