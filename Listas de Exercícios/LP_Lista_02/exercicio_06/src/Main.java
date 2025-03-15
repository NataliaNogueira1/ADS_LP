//6. Ler uma velocidade em m/s e converter para Km/h.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel, result;

        System.out.println("Digite a velocidade (em m/s): ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        vel = in.nextDouble();

        result = vel * 3.6;
        System.out.println("A velocidade em Km/h é " + result);
    }
}