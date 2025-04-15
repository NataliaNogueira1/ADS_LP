//6. Peça para o usuário inserir dois números inteiros e exiba todos os números
// naturais existentes entre os números digitados.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        n1 = in.nextInt();

        System.out.println("Digite outro número inteiro:");
        n2 = in.nextInt();

        System.out.println("---------------------------");
        System.out.println("Números entre eles:");

        for (int i = n1+1; i <= n2-1; i++) {
            System.out.print(i + "\n");
        }
    }
}