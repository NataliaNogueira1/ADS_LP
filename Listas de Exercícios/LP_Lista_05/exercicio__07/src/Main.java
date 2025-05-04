//7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e
// a maior soma entre suas linhas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p1=0, p2=0, sum = 0, sumc = 0;
        int[][] matriz = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Coluna " + i);
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\nDigite o " + j + "º número: ");
                matriz[i][j] = scanner.nextInt();
            }
            System.out.println("---------------------------");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        int maiorl = Integer.MIN_VALUE, maiorc = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            sum = 0;
            for (int j = 0; j < matriz.length; j++) {
                sum += matriz[i][j];
            }
            if (sum > maiorl) {
                maiorl = sum;
                p1 = i;
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            sumc = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumc += matriz[i][j];
            }
            if (sumc > maiorc) {
                maiorc = sumc;
                p2 = j;
            }
        }

        System.out.println("---------------------------");
        System.out.println("A maior soma entre as linhas é: " + maiorl + ", é a " + p1 + "º linha da matriz");
        System.out.println("A maior soma entre as colunas é: " + maiorc + ", é a " + p2 + "º coluna da matriz");

    }
}