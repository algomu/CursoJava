package primerospasos;
import javax.swing.*;
public class Uso_Arrays2 {
    public static void main(String[] args) {
        String [] paises=new String[5];
        /*
           paises[0]="España";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Eduador";
        paises[4]="Venezuela";
        paises[5]="Paraguay";
        paises[6]="Brasil";
        paises[7]="Mongolia";

        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i+1) + " = " + paises[i]);
        }
        */

        // String [] paises = {"España","EEUU","Alemania","Francia","Italia","Moldavia"};

        for (int i = 0; i < paises.length; i++) {
            paises[i]=JOptionPane.showInputDialog("Introduce pais: ");
        }

        for(String elemento:paises) {
            System.out.println("Pais: " + elemento);
        }

    }
}
