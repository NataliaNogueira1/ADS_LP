//5. Ler uma velocidade em Km/h e converter para m/s.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel, result;

        System.out.println("Digite a velocidade (em Km/h): ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        vel = in.nextDouble();

        result = vel / 3.6;
        System.out.println("A velocidade em m/s é " + result);
    }
}