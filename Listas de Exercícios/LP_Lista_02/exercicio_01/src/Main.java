//1. Ler um número inteiro e exibir o seu dobro.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); //Configura o scanner
        number = in.nextInt();

        result = number * 2;
        System.out.println("O dobro de " + number + " é " + result);
    }
}