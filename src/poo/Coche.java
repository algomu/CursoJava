package poo;
/**
 * Coche
 */

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    public Coche(){

        ruedas              = 4;
        largo               = 750;
        ancho               = 190;
        motor               = 1600;
        peso_plataforma     = 600;
    }
    
    // Metodo getter
    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas. Mide " + ((float)largo/100) + " metros" +
        " con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " Kg.";
    }

    public String dime_largo(){
        return "El largo del coche es " + largo;
    }

    public String dime_color(){
        return "El color del coche es " + color;
    }

    public String dime_asientos(){
        String asientos;
        
        if (asientos_cuero) {
            asientos="si";  
        } else {
            asientos="no";
        }
        
        return "El coche " + asientos + " tiene asientos de cuero.";   
    }

    public String dime_climatizador(){

        if (climatizador) {
            return "El coche lleva climatizador.";
        } else {
            return "El coche lleva aire acondicionado normal.";
        }
    }

    public int precio_coche(){
        int precio_final=10000;

        if (asientos_cuero) {
            precio_final+=2000;
        }
        if (climatizador) {
            precio_final+=1500;
        }
        return precio_final;
    }


    // Metodo setter
    public void establece_color(String color_coche){
        color = color_coche;
    }

    public void establece_asientos(boolean asientos_cuero){
        this.asientos_cuero = asientos_cuero;
    }

    public void configura_climatizador(boolean climatizador){
        this.climatizador = climatizador;
    }

    //Metodo setter + getter
    public String dime_peso_coche (){
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;

        if (asientos_cuero) {
            peso_total=peso_total+50;
        }

        if (climatizador) {
            peso_total=peso_total+20;
        }
        return "El peso del coche es " + peso_total;
    }

}