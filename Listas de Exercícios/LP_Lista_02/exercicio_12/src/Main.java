//12. Ler duas notas N1 e N2 e exibir a média.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, num, result;

        System.out.println("Digite n1: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        n1 = in.nextDouble();

        System.out.println("Digite n2: ");
        n2 = in.nextDouble();

        num = n2 * 2;
        result = (n1+num) / 3;
        System.out.println("A média é " + result);
    }
}