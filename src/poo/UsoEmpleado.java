package poo;

import java.util.*;

public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Don Sebastina", 100000, 2020, 01, 07);
        jefe_RRHH.estableceIncentivo(50000);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Alberto Gómez", 40000, 2016, 1, 9);
        misEmpleados[1] = new Empleado("Angustiosa Martinez", 10000, 2000, 2, 5);
        misEmpleados[2] = new Empleado("Maria Pedorra", 50000, 2006, 12, 12);
        misEmpleados[3] = new Empleado("John Do");
        misEmpleados[4] = jefe_RRHH; // Polimorfismo. Principio de sustitución.
        misEmpleados[5] = new Jefatura("Federica Augusta", 100000, 2020, 1, 1);

        Jefatura jefe_finanzas = (Jefatura) misEmpleados[5];
        jefe_finanzas.estableceIncentivo(10000);

        System.out.println(jefe_finanzas.tomar_decisiones("regalar un gatito a cada empleado."));
        System.out.println(jefe_finanzas.dameNombre() + " tiene una prima de " + jefe_finanzas.establece_bonus(500));


        System.out.println(misEmpleados[3].dameNombre() + " tiene una bonus de: " + misEmpleados[3].establece_bonus(50));;

        for (Empleado e : misEmpleados) {
            e.subeSueldo(10);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: "
                    + e.dameFechaContrato());
        }
    }

}

class Empleado implements Comparable, Trabajadores {

    // CONSTRUCTORES
    public Empleado(String nom, double sue, int anyo, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anyo, mes - 1, dia);
        altacontrato = calendario.getTime();
        ++id_siguiente;
        id = id_siguiente;
    }

    public double establece_bonus(double gratificacion) {
        return Trabajadores.bonus_base + gratificacion;
    }

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    // GETTERS
    public String dameNombre() {
        return nombre + ", ID: " + id;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altacontrato;
    }

    // SETTER
    public void subeSueldo(double porcentage) {
        double aumento = sueldo * porcentage / 100;
        sueldo += aumento;
    }

    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo < otroEmpleado.sueldo) {
            return 1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return -1;
        }
        return 0;
    }

    private String nombre;
    private double sueldo;
    private Date altacontrato;
    private static int id_siguiente;
    private int id;

}

class Jefatura extends Empleado implements Jefes {

    public Jefatura(String nom, double sue, int anyo, int mes, int dia) {
        super(nom, sue, anyo, mes, dia);
    }

    private double incentivo;

    // Setter
    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    // Getter
    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    public String tomar_decisiones(String decision) {
        return "Un miembro de la dirección a decidido: " + decision;
    }

    public double establece_bonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonus_base + prima + gratificacion;
    }
}