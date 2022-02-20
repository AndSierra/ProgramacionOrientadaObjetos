package clases;

import javax.swing.JOptionPane;

public class Operaciones {

    int n1,n2, sumaR,restaR,multiplicacionR, moduloR;
    double divicionR;
    private int mayor;
    private int menor;
    private int medio;
    private double inverso;

    public int getMayor() {
        return mayor;
    }

    public int getMenor() {
        return menor;
    }

    public int getMedio() {
        return medio;
    }

    public double getInverso() {
        return inverso;
    }

    public void calcularMayorMenor(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            this.menor = n1;

            if (n2 > n3) {
                this.mayor = n2;
                this.medio = n3;

            } else {
                this.mayor = n3;
                this.medio = n2;
            }
        } else {
            if (n2 < n3 && n2 < n1) {
                this.menor = n2;

                if (n3 > n1) {
                    this.mayor = n3;
                    this.medio = n1;

                } else {
                    this.mayor = n1;
                    this.medio = n3;
                }
            } else {
                if (n3 < n2 && n3 < n1) {
                    this.menor = n3;

                    if (n1 > n2) {
                        this.mayor = n1;
                        this.medio = n2;

                    } else {
                        this.mayor = n2;
                        this.medio = n1;
                    }
                }
            }

        }

    }

    public void calcularInverso(double n1) {
        this.inverso = 1 / n1;
        System.out.println(inverso);
    }

    public boolean calcularPositivo(int n1) {
        if (n1 < 0) {
            return false;
        } else {
             return true;
        }
    }

    public boolean calcularPar(int n1) {
        if (n1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int suma(int n1, int n2) {
        this.sumaR = n1 + n2;
        return sumaR;
    }

    public int resta(int n1, int n2) {
        this.restaR = n1 - n2;
        return restaR;
    }

    public int multiplicacion(int n1, int n2) {
        this.multiplicacionR = n1 * n2;
        return multiplicacionR;
    }

    public double divicion(double n1, double n2) {
        this.divicionR = n1 / n2;
        return divicionR;
    }

    public int modulo(int n1, int n2) {
        this.moduloR = n1 % n2;
        return moduloR;
    }

}
