package primerospasos;

import java.util.Scanner;

public class UsoTallas {
    
    enum Talla {
        
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
        private Talla (String abreviatura) {
            this.abreviatura=abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    };



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escrite una talla (MINI/MEDIANO/GRANDE/MUYGRANDE): ");
        String entradaDatos=entrada.next().toUpperCase();

        Talla la_talla=Enum.valueOf(Talla.class, entradaDatos);

        System.out.println("Talla: " + la_talla);
        System.out.println("Abreviatura: " + la_talla.dameAbreviatura());

    }
}
