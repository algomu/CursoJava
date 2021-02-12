package primerospasos;
import java.util.*;
import javax.swing.*;
public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado\n2: Rectangulo\n3: Triángulo\n4: Circulo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide el lado 1?"));
                System.out.println("Su area es " + Math.pow(lado, 2));
                break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la base?"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la altura?"));     
                System.out.println("Su area es " + (base * altura));       
                break;
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la base?"));
                altura=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la altura?"));     
                System.out.println("Su area es " + ((base * altura)/2));                
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Cual es su radio?"));    
                System.out.print("Su area es: "); 
                System.out.printf( "%1.4f" , Math.PI * Math.pow(radio, 2)) ;                           
                break;
            default:
                System.out.println("Introduce un valor valido...");
                break;
        }


    }
}
