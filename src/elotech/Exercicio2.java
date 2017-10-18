package elotech;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayara Oliva Ferreira
 */
public class Exercicio2 {

    public static void main(String[] args) {

        String numeroDegraus = JOptionPane.showInputDialog(null, "Digite o numero de degraus que deseja: ");
        //String escada = "#";
        boolean isInt = numeroDegraus.matches("\\d+");
        if (isInt) {
            int degrau = Integer.parseInt(numeroDegraus);
            String retornoEscada = escada(degrau);
            JLabel messageLabel = new JLabel(retornoEscada);
            JOptionPane.showMessageDialog(null, messageLabel);
        } else {
            JOptionPane.showMessageDialog(null, "Não é permitido informar números negativos ou outros caracteres!");
        }
    }

    public static String escada(int numeroDegraus) {
        String escada = "";
        if (numeroDegraus > 2) {
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < numeroDegraus; i++) {
                b.append("#");
                escada += b.toString() + "<br />";
            }
        }
        String message = "<html><body><div width='200px' align='right'>" + escada + "</div></body></html>";
        System.out.println(message);
        return message;
    }
}
