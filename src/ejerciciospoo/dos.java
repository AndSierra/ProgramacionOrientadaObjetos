package ejerciciospoo;

import clases.Operaciones;
import javax.swing.JOptionPane;

public class dos {

    public static void main(String[] args) {
        int numero1, numero2, numero3;

        Operaciones op = new Operaciones();

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero #1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero #2"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero #3"));
        
        op.calcularMayorMenor(numero1, numero2, numero3);
        
        JOptionPane.showMessageDialog(null, "Mayor: "+op.getMayor()+" \n"
                + "Medio: "+op.getMedio()+" \n"
                + "Menor: "+op.getMenor()+" \n");

    }

}
