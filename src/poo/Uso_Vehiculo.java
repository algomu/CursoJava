package poo;

public class Uso_Vehiculo {
    public static void main(String[] args) {

        Coche micoche1=new Coche();
        micoche1.establece_color("verde");

        Furgoneta mifurgoneta1=new Furgoneta(7, 500);
        mifurgoneta1.establece_color("Blanco");
        mifurgoneta1.establece_asientos(true);
        mifurgoneta1.configura_climatizador(true);

        System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
        System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dime_datos_furgoneta());
    }

}
