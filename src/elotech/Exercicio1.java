package elotech;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Informe números para compor uma lista, os números devem ser maior igual a 1. Para terminar a lista digite 0.");

        int fimArray = 1;
        while (fimArray != 0) {
            int inputArray;
            String inString = JOptionPane.showInputDialog(null, "Digite o numero: ");
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
            } else {
                JOptionPane.showMessageDialog(null, "Não é um inteiro! ");
            }
        }
        int numeroRepet = primeiroRepetido(numeros);
        if (numeroRepet == 0) {
            JOptionPane.showMessageDialog(null, "A lista deve conter mais de um número!");
        } else {
            JOptionPane.showMessageDialog(null, "O número que se repete é : " + numeroRepet);
        }
    }

    public static int primeiroRepetido(List<Integer> numeros) {
        //Se o array for maior que 1 compara elementos
        if (numeros.size() > 1) {
            int indiceAntigo = numeros.size(), indiceNovo;
            for (int i = 0; i < numeros.size(); i++) {
                //compara cada elemento da lista com todos os outros elementos da lista
                for (int j = i; j < numeros.size(); j++) {
                    //só commpara os elementos se eles não estiverem na mesma posição
                    if (i != j) {
                        if (Objects.equals(numeros.get(i), numeros.get(j))) {
                            //se encontrado um elemento igual , retorna o número
                            indiceNovo = j;
                            if (indiceNovo < indiceAntigo) {
                                indiceAntigo = indiceNovo;
                            }
                        }
                    }
                }
            }
            if (indiceAntigo != numeros.size()) {
                return numeros.get(indiceAntigo);
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
