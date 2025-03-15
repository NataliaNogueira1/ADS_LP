//9. Ler uma medida de distância em quilômetros e converter para milhas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel, result;

        System.out.println("Digite a distância (em Km): ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        vel = in.nextDouble();

        result = vel / 1.60934;
        System.out.println("A distância em milhas é " + result);
    }
}