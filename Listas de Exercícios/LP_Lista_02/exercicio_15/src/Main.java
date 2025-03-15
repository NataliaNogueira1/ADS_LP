//15. Receber o raio e a altura de um cilindro e calcular seu volume.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a, result;

        System.out.println("Raio do cilindro: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        System.out.println("Altura do cilindro: ");
        a = in.nextDouble();

        result = (r * r ) * 3.14 * a;
        System.out.println("O volume é de aproximadamente: " + result);
    }
}