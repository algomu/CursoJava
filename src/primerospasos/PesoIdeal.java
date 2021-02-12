package primerospasos;
import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args) {
        
        String genero;

        do {
            genero=JOptionPane.showInputDialog("Introduce el género (H/M). ");
        } while ( genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );

        int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros: "));

        int peso_ideal = 0;
        int resta = 0;

        if (genero.equalsIgnoreCase("H") == true) {
            resta = 110;
        } else {
            resta = 120;
        }

        System.out.println("Tu peso ideal es "+ (altura - resta)+" Kg.");
    }
}
