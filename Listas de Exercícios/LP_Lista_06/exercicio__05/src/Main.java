//5. Implemente uma função para realizar uma busca binária em um array ordenado de inteiros,
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

        Scanner n = new Scanner (System.in);

        System.out.println("Digite o número que deseja procurar:");
        int num = n.nextInt();

        int result = Pesquisa(array, num);

        System.out.println("Array depois de ordenada: ");
        for (int i=0; i < array.length-1; i++){
            System.out.print(array[i]+", ");
        }

        System.out.println("\n");

        if(result != -1) {
            System.out.println("O número digitado existe na posição: " + result);
        }else {
            System.out.println(-1);
        }
    }

    public static int Pesquisa(int[] array, int num){
        int start = 0;
        int end = array.length -1;

        while (start <= end) {
            int meio = (start + end) / 2;

            if (array[meio] == num) {
                return meio;
            } else if (array[meio] < num) {
                start = meio + 1;
            } else {
                end = meio - 1;
            }
        }

        return -1;
    }
}