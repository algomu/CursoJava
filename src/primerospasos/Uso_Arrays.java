package primerospasos;
public class Uso_Arrays {
    public static void main(String[] args) {
        /*
        int [] mi_matriz=new int[5];

        mi_matriz[0]=5;
        mi_matriz[1]=23;
        mi_matriz[2]=452;
        mi_matriz[3]=67;
        mi_matriz[4]=15;
        
        System.out.println(mi_matriz[3]);
        */

        int [] mi_matriz ={ 10, 45, 77, 34, -1};

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Valor del indice " + i + " = " +mi_matriz[i]);            
        }
    }
}
