package elotech;

import java.awt.Component;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class Exercicio3 {

    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();

        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Informe números para compor uma lista. Para terminar a lista digite 0.");

        int fimArray = 1;
        while (fimArray != 0) {
            int inputArray;
            String inString = JOptionPane.showInputDialog(null, "Digite o numero que deseja adicionar a lista: ");
            boolean isInt = inString.matches("\\d+");
            if (isInt) {
                inputArray = Integer.parseInt(inString);
                fimArray = inputArray;
                if (inputArray != 0 && inputArray >= 1) {
                    numeros.add(inputArray);
                } else if (inputArray < 0) {
                    JOptionPane.showMessageDialog(null, "Não é permitido informar números negativos!");
                } else {
                    JOptionPane.showMessageDialog(null, "A lista informada é : " + numeros);
                }
            }
        }
        //Se o array for maior que 1 compara elementos
        String stringRemoverNum = JOptionPane.showInputDialog(null, "Digite o numero que deseja retirar da lista: ");
        boolean isInt = stringRemoverNum.matches("\\d+");
        int removeNum = 0;
        if (isInt) {
            removeNum = Integer.parseInt(stringRemoverNum);
        } else {
            JOptionPane.showMessageDialog(null, "Não é permitido informar números negativos!");
        }
        String resposta = RemoveItem(numeros, removeNum);
        JOptionPane.showMessageDialog(null, resposta);
        System.out.println(resposta);
    }

    public static String RemoveItem(List<Integer> numeros, int removerNum) {
        String resposta = "";
        if (numeros.size() > 1) {

            int qtdade = numeros.size();

            numeros.removeIf(s -> s.equals(removerNum));
            int novaQtdade = numeros.size();

            if (qtdade == novaQtdade) {
                resposta = "Número informado não existe na lista";
            } else {
                resposta = "A nova lista é : " + numeros;
            }

        } else {
            resposta = "A lista deve conter mais de um número!";
        }
        return resposta;
    }

}
