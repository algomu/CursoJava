package primerospasos;
public class Prueba {

    public static void main(String[] args) throws Exception {
        double base = 5;
        double exponente=3;
        String mi_nombre = "Alberto";
        int tam_nombre = mi_nombre.length();
        int resultado = (int) Math.pow(base, exponente);

        System.out.println(mi_nombre + ", el resultado de la operación es: " + resultado + " y tu nombre tiene " + tam_nombre + " caracteres");
    }
}
