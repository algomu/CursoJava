package primerospasos;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        int intentos    = 0;
        int numero   = 0;

        do {
            System.out.println("Que numero he elegido? ");
            numero = entrada.nextInt();
            intentos++;

            if (numero > aleatorio) {
                System.out.println("Te has pasado de largo!!!!");
            } else if (numero < aleatorio) {
                System.out.println("Te has quedado corto!!!");
            } else {
                System.out.println("Enhorabuena, tienes buen ojo, solo has necesitado " + intentos + " intentos para adivinar " + aleatorio + " !!!");
            }
        } while (numero != aleatorio);
    }
}
