package poo;

public class Furgoneta extends Coche {
    
    private int capacidad_de_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_de_carga){

        super(); //Llama al constructor del padre
        this.capacidad_de_carga=capacidad_de_carga;
        this.plazas_extra=plazas_extra;

    }

    //Getter
    public String dime_datos_furgoneta(){
        return "La capacidad de carga es " + capacidad_de_carga + " y las plazas extras son " + plazas_extra;
    }
}
