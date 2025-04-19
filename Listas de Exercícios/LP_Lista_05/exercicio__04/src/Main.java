//4. Crie um programa que armazene 10 números inteiros inseridos pelo
// usuário em um vetor. Em seguida, percorra o vetor e indique onde estão
// o maior e o menor número (imprima seus valores e suas posições no vetor).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {89,6,5,2,1,4,3,8,9,11};
        int p1=0, p2=0;

        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            number = scanner.nextInt();

            if (number > maior){
                maior = number;
                p1 = i;
            }
            if (number < menor) {
                menor = number;
                p2 = i;
            }
        }

        System.out.println("---------------------------");
        System.out.println("O maior número é: " + maior + ", ele está na posição " + p1 + " do vetor");
        System.out.println("O menor número é: " + menor + ", ele está na posição " + p2 + " do vetor");

    }
}