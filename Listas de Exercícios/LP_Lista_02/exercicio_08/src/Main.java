//8. Ler uma medida em polegadas e converter para milímetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double med, result;

        System.out.println("Digite a medida em polegadas: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        med = in.nextDouble();

        result = med * 25.4;
        System.out.println("A medida em milímetros é " + result);
    }
}