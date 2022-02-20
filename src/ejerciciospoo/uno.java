
package ejerciciospoo;

import clases.Operaciones;
import javax.swing.JOptionPane;

public class uno {

    public static void main(String[] args) {
        int numero1,numero2;
        
        Operaciones op = new Operaciones();
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        
        JOptionPane.showMessageDialog(null,"Suma: "+op.suma(numero1,numero2)+"\n"+
                "Resta: "+op.resta(numero1,numero2)+"\n"+
                "Multiplicacion: "+op.multiplicacion(numero1,numero2)+"\n"+
                "Divicion: "+op.divicion(numero1,numero2)+"\n"+
                "Modulo: "+op.modulo(numero1,numero2));

    }
    
}
