package primerospasos;
public class Uso_Arrays_Bidimensionales {
    public static void main(String[] args) {
        int [][] matrix={
            {4,76,5,2,6},
            {34,23,6,23,1},
            {3,64,2,1,46},
            {22,1,66,7,8}
        };
/*
        int [][] matrix=new int[4][5];
        matrix[0][0]=23;
        matrix[0][1]=32;
        matrix[0][2]=3;
        matrix[0][3]=11;
        matrix[0][4]=115;

        matrix[1][0]=53;
        matrix[1][1]=23;
        matrix[2][2]=66;
        matrix[1][3]=954;
        matrix[1][4]=5;

        matrix[2][0]=234;
        matrix[2][1]=6343;
        matrix[2][2]=326;
        matrix[2][3]=7;
        matrix[2][4]=110;

        matrix[3][0]=77;
        matrix[3][1]=82;
        matrix[3][2]=567;
        matrix[3][3]=25;
        matrix[3][4]=1871;

       // System.out.println(matrix[2][3]);

        // Metodo tradicional
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j=0; j<5; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
*/
        // con foreach o for abreviado.
        for (int[] fila : matrix) {
            System.out.println();
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
        }

    }
}
