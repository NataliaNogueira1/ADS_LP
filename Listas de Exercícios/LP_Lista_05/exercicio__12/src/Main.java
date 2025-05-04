//12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.

public class Main {
    public static void main(String[] args) {
        int d1,d2, d3, d4, d5, d6, df = 0;
        int[][] matriz = {
                {1, 2, 3},
                {6, 7, 7},
                {10, 12, 3}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        //primaria
        d1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
        d2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
        d3 = matriz[0][2] * matriz[1][0] * matriz[2][1];

        //secundaria
        d4 = matriz[2][0] * matriz[1][1] * matriz[0][2];
        d5 = matriz[2][1] * matriz[1][2] * matriz[0][0];
        d6 = matriz[2][2] * matriz[1][0] * matriz[0][1];

        //final
        df = (d1 + d2 + d3) - (d4 + d5 + d6);
        System.out.println("\nDeterminante: "+df);
    }
}