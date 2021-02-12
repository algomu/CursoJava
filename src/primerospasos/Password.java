package primerospasos;
import javax.swing.*;

public class Password {
    public static void main(String[] args) {
        final String password = "Alberto";
        String cadena = "";
        while (password.equals(cadena) == false) {
            cadena = JOptionPane.showInputDialog("Introduce la contraseña");
        }
        System.out.print("Bienvenido, contraseña correcta.");
    }
}
