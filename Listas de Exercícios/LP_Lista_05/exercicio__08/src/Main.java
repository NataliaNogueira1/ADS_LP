//8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + ", ");
        }
    }
}