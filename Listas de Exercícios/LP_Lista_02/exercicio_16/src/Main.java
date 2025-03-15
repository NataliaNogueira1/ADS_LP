//16. Receber o raio e a altura de um cone e calcular seu volume.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a, result;

        System.out.println("Raio do cone: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        System.out.println("Altura do cone: ");
        a = in.nextDouble();

        result = ((r * r ) * a * 3.14) /3;
        System.out.println("O volume é de aproximadamente: " + result);
    }
}