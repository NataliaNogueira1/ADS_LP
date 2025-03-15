//7. Ler uma medida em milímetro e converter para polegadas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double med, result;

        System.out.println("Digite a medida em milímetros: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        med = in.nextDouble();

        result = med / 25.4;
        System.out.println("A medida em polegadas é " + result);
    }
}