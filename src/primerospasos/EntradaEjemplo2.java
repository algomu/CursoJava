package primerospasos;
import javax.swing.*;
public class EntradaEjemplo2 {
    public static void main(String[] args) {
        String nombre_usuario =JOptionPane.showInputDialog("Introduce tu nombre por favor:");

        String edad = JOptionPane.showInputDialog("Introduce la edad por favor:");
        int edad_usuario =Integer.parseInt(edad);
        edad_usuario++;

        System.out.println("Hola " + nombre_usuario + " el año que viene tendras " + edad_usuario);

    }
}
