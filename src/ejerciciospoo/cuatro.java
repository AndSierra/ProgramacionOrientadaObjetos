package ejerciciospoo;

import clases.Operaciones;
import javax.swing.JOptionPane;

public class cuatro {

    public static void main(String[] args) {
        int numero1;

        Operaciones op = new Operaciones();

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero #1"));

        boolean esPositivo = op.calcularPositivo(numero1);

        if (numero1 == 0) {
            JOptionPane.showMessageDialog(null, "El número es neutro");

        } else if (esPositivo == false) {
            JOptionPane.showMessageDialog(null, "El número es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El número es positivo");
        }
    }

}
