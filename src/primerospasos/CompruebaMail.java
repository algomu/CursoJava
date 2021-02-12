package primerospasos;
import javax.swing.JOptionPane;

public class CompruebaMail {
    public static void main(String[] args) {
        
        int arroba      = 0;
        int pos_arroba  = 0;
        boolean punto   =false;
        
        String correo = JOptionPane.showInputDialog("Introduce tu correo electronico.");
        
        // El correo debe tener solo una @ y, al menos, un punto mas alla de la arroba y que no sea el ultimo caracter.
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i)=='@') {
                arroba++;
                pos_arroba=i;
            }

            if (correo.charAt(i)=='.' && arroba == 1 && i > pos_arroba && i != correo.length()-1) {
                punto = true;
            }
        }
        System.out.println("arroba =" + arroba + ", pos_arroba=" + pos_arroba +", punto " + punto);
        if (arroba==1 && punto==true ){
            System.out.println("Correo correcto.");
        } else {
            System.out.println("El correo no es valido.");
        }
    }
}
