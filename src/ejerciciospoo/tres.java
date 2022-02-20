package ejerciciospoo;

import clases.Operaciones;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class tres {

    public static void main(String[] args) {
        double numero1;
        DecimalFormat df = new DecimalFormat("#");
        
        Operaciones op = new Operaciones();

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero para saber su inverso"));

        op.calcularInverso(numero1);

        JOptionPane.showMessageDialog(null, "El inverso de " + df.format(numero1) + " es " + op.getInverso());
    }

}
