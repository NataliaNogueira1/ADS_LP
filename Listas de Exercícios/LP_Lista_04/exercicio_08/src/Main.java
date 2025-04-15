//8. Criar um programa onde o usuário entra com um número e
// o programa diz se o número digitado é primo ou não.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scanner.nextInt();
        int calc = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                calc++;
                break;
            }
        }
        if (calc == 0) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " não é um número primo");
        }
    }
}