//2. Ler um número inteiro e exibir o seu quadrado.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); //Configura o scanner
        number = in.nextInt();

        result = number * 4;
        System.out.println("O quadrado de " + number + " é " + result);
    }
}