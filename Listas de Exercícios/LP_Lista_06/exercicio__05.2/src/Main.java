// RECURSIVA
// 5. Implemente uma função para realizar uma busca binária em um array ordenado de inteiros,
// retornando a posição do elemento buscado ou -1 se o elemento não for encontrado.
//A busca binária é um algoritmo eficiente para encontrar um elemento em um vetor ordenado.
// Ele funciona dividindo repetidamente o vetor pela metade e determinando em qual
// metade o elemento buscado pode estar presente.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[] = {58, 2, 3, 45, 67, 985, 1};

        Arrays.sort(array);

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número que deseja procurar:");
        int num = in.nextInt();

        int result = Pesquisa(array, num, 0, array.length - 1);

        System.out.println("Array depois de ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");

        if (result != -1) {
            System.out.println("O número digitado existe na posição: " + result);
        } else {
            System.out.println(-1);
        }
    }

    public static int Pesquisa(int[] array, int num, int start, int end) {
        if (start > end) {
            return -1;
        }

        int n = (start + end) / 2;

        if (array[n] == num) {
            return n;
        } else if (array[n] > num) {
            return Pesquisa(array, num, start, n - 1);
        } else {
            return Pesquisa(array, num, n + 1, end);
        }
    }
}
