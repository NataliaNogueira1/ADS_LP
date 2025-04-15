//2. Criar um programa que receba 5 números inteiros digitados
// pelo usuário e ao final exiba o maior e o menor números
// digitados (Obs.: Apenas o maior e o menor número devem ser armazenados).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int number = scanner.nextInt();
        int maior = number;
        int menor = number;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            number = scanner.nextInt();

            if (number > maior) {
                maior = number;
            } else if (number < menor) {
                menor = number;
            }
        }

        System.out.println("---------------------------");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}