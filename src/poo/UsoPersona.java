package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
    public static void main(String[] args) {

        Persona[] misPersonas=new Persona[2];
        
        misPersonas[0]=new Empleado2("Vicent", 40000, 2000, 01, 01);
        misPersonas[1]=new Alumno("Alberto", "Informática");
        

        for (Persona p : misPersonas) {
            System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }
    }
}

abstract class Persona {

        public Persona(String nom) {
            nombre=nom;    
        }
        
        //GETTERS
        public String dameNombre() {
            return nombre;
        }

        public abstract String dameDescripcion();

        private String nombre;


}

class Empleado2 extends Persona {

    //CONSTRUCTORES
    public Empleado2 (String nom, double sue, int anyo, int mes, int dia) {
        
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(anyo, mes-1, dia);
        altacontrato=calendario.getTime();
        ++id_siguiente;
        id=id_siguiente;
    }

    public String dameDescripcion() {
        return "este usuario tiene un ID: " + id + ", con un sueldo igual a " + sueldo;
    }

    public double dameSueldo(){
        return sueldo;
    }

    public Date dameFechaContrato(){
        return altacontrato;
    }

    //SETTER
    public void subeSueldo(double porcentage){
        double aumento= sueldo * porcentage/100;
        sueldo+=aumento;
    }


    private double sueldo;
    private Date altacontrato;
    private static int id_siguiente;
    private int id;

}

class Alumno extends Persona {

    public Alumno (String nom, String car) {
        super(nom);
        carrera=car;
    }

    public String dameDescripcion() {
        return "este alumno esta estudiando la carrera de: " + carrera;
    }

    private String carrera;
}

