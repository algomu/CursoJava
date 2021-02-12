package primerospasos;
public class Uso_Arrays_Num {
    public static void main(String[] args) {
        int [] numeros_aleatorios=new int[150];

        for (int i=0 ; i<numeros_aleatorios.length;i++) {
            numeros_aleatorios[i]=(int)((Math.random()*100/5)+1);
        }

        for (int numero : numeros_aleatorios) {
            System.out.println(numero);
        }
    }
}
