//5. Crie um programa que possua um vetor de 10 posições com os seguintes valores
// inteiros armazenados:
//    int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    Quando executado o programa deve criar uma cópia “invertida” em
//    um segundo vetor e em seguida exibir ambos os vetores

public class Main {
    public static void main(String[] args) {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[v1.length];

        System.out.println("Vetor 1:");
        for (int i = 0; i < v1.length; i++){
            System.out.print(v1[i]+", ");
            v2[i] = v1 [v1.length - 1 -i];
        }

        System.out.println("\nVetor 2:");
        for (int i = 0; i < v2.length; i++){
            System.out.print(v2[i]+", ");
        }

    }
}