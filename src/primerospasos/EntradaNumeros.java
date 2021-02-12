package primerospasos;
import javax.swing.*;
public class EntradaNumeros {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Introduce un número:");
        double numero = Double.parseDouble(num1);
        double raiz = Math.sqrt(numero);
        System.out.printf("%1.2f",raiz);
    }
}
