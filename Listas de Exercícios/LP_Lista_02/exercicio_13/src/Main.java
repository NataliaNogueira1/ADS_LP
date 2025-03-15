//13. Receber o raio de um círculo e calcular sua área.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, result;

        System.out.println("Raio: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        result = (r * r ) * 3.14;
        System.out.println("A área é de aproximadamente: " + result);
    }
}