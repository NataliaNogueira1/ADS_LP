//4. Ler duas notas N1 e N2 e exibir a média.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        System.out.println("Digite n1: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        n1 = in.nextDouble();

        System.out.println("Digite n2: ");
        n2 = in.nextDouble();

        result = (n1+n2) / 2;
        System.out.println("A média é " + result);
    }
}