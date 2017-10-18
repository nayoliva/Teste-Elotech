package elotech;

import javax.swing.JOptionPane;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class Exercicio4 {

    public static void main(String[] args) {
        int valorConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da conta (valor inteiro): "));
        int valorPago = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor pago(valor inteiro): "));
        JOptionPane.showMessageDialog(null, "O troco é de: " + calculaTroco(valorConta, valorPago));
        System.out.println(calculaTroco(valorConta, valorPago));
    }

    public static String calculaTroco(int conta, int pago) {

        if (conta > pago) {
            return ("Pagamento insuficiente, faltam R$ " + (conta - pago));

        } else if (((pago - conta) == 1) || ((pago - conta) == 3)) {
            return ("Sistema não possibilita realizar troco");
        } else {
            int nota[] = {100, 50, 20, 10, 5, 2};
            int troco = pago - conta;
            int i, qtdade, vlr;
            String result = "";
            i = 0;
            vlr = troco;
            while (vlr != 0) {
                qtdade = vlr / nota[i]; // calculando a qtde de notas
                if (qtdade != 0) {
                    vlr = vlr % nota[i]; // sobra
                    if ((vlr == 1 || vlr == 3) && (nota[i] == 5)) {
                        //volta pro valor antigo
                        vlr = vlr + nota[i];
                    } else {
                        result = result + (qtdade + " nota(s) de R$ " + nota[i] + "-");
                    }
                }
                i = i + 1; // próxima nota
            }
            return (result);
        }
    }
}
