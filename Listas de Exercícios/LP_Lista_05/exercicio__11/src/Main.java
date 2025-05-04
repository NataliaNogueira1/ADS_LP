//11. Aperfeiçoe o exercício anterior solicitando para que o usuário
// informe o tamanho das matrizes a serem multiplicadas.
//Valide se é possível calcular a matriz produto.
//A multiplicação de matrizes só é possível quando o número de colunas
// da primeira matrizé igual ao número de linhas da segunda matriz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int linhas=0, colunas=0, linhas2=0, colunas2=0;

        System.out.println("Número de colunas da matriz 1: ");
        Scanner scanner = new Scanner(System.in);
        colunas = scanner.nextInt();

        System.out.println("Número de linhas da matriz 1: ");
        linhas = scanner.nextInt();

        System.out.println("Número de colunas da matriz 2: ");
        colunas2 = scanner.nextInt();

        System.out.println("Número de linhas da matriz 2: ");
        linhas2 = scanner.nextInt();

        if (colunas == linhas2){
            int[][] A = new int[linhas][colunas];
            int[][] B = new int[linhas2][colunas2];
            int[][] C = new int[linhas][colunas2];

            System.out.println("---------------------------");
            System.out.print("Matriz 1");
            System.out.println("\n---------------------------");
            for (int i = 0; i < linhas; i++) {
                System.out.print("\nColuna " + i);
                for (int j = 0; j < colunas; j++) {
                    System.out.print("\nDigite o " + j + "º número: ");
                    A[i][j] = scanner.nextInt();
                }
                System.out.println("---------------------------");
            }

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println(" ");
            }

            System.out.println("---------------------------");
            System.out.print("Matriz 2");
            System.out.println("\n---------------------------");
            for (int i = 0; i < linhas2; i++) {
                System.out.print("Coluna " + i);
                for (int j = 0; j < colunas2; j++) {
                    System.out.print("\nDigite o " + j + "º número: ");
                    B[i][j] = scanner.nextInt();
                }
                System.out.println("---------------------------");
            }

            for (int i = 0; i < linhas2; i++) {
                for (int j = 0; j < colunas2; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println(" ");
            }

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("---------------------------");
            System.out.println("Produto:");
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println(" ");
            }

        }else{
            System.out.println("Não é possível multiplicar essas matrizes, o número de colunas da primeira matriz tem que ser igual ao número de linhas da segunda matriz");
        }

    }
}