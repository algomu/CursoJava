package primerospasos;
public class OtraPrueba {
    public static void main(String[] args) {
        
        Empleados trabajador1= new Empleados("Argento Martinez");
        Empleados trabajador2= new Empleados("Dorada Jimenez");
        Empleados trabajador3= new Empleados("Paca Jimenez");

        trabajador1.cambiaSeccion("Contabilidad");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados{
    
    public Empleados (String nom){

        nombre=nom;
        seccion="Administración";
        id=id_siguiente;
        id_siguiente++;
    }

    // Setter
    public void cambiaSeccion(String seccion){

        this.seccion=seccion;
    }

    // Getter
    public String devuelveDatos(){
        return "El nombre es "+ nombre +" con id " + id + " y la sección "+ seccion;
    }

    public static String dameIdSiguiente(){
        return "El id siguiente es " + id_siguiente;
    }


    private final String nombre;
    private String seccion;
    private int id;
    private static int id_siguiente=1;

}