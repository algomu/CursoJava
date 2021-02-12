package primerospasos;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos años tienes?: ");
        int edad = entrada.nextInt();
/*
        if (anyos > 17) {
            System.out.println("Enhorabuena! Puedes beber alcohol!!");
        } else {
            System.out.println("Lo siento, aquí tienes tu coca cola sin cafeina.");
        }
*/
        if (edad < 18) {
            System.out.println("Lo siento, no puedes beber alcohol!!");
        } else if (edad < 40 ) {
            System.out.println("Aquí tienes una cervecita.");
        } else if (edad < 65 ) {
            System.out.println("No tomes muchas abuelete.");
        } else {
            System.out.println("No puedo ser responsable de tu borrachera.");
        }
    }
}
