//10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a matriz
// produto entre as duas matrizes.
//Exemplo de como calcular a matriz produto:

public class Main {
    public static void main(String[] args) {
        int c[][] = new int [3][2];
        int[][] matriz1 = {
                {1, 2},
                {6, 7},
                {4, 3}
        };

        int[][] matriz2 = {
                {1, 2},
                {6, 7}
        };

        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz2.length; k++) {
                    c[i][j] = c[i][j] + matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Produto:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}