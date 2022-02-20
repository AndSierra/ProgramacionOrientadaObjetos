
package ejerciciospoo;

import clases.Operaciones;
import javax.swing.JOptionPane;

public class cinco {

    public static void main(String[] args) {
               int numero1;

        Operaciones op = new Operaciones();

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero"));

        boolean esPar = op.calcularPositivo(numero1);

        if (numero1 == 0) {
            JOptionPane.showMessageDialog(null, "El número es neutro");

        } else if (esPar == true) {
            JOptionPane.showMessageDialog(null, "El número es par");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar");
        }
    }
    
}
