//10. Ler uma medida de distância em milhas e converter para quilômetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dis, result;

        System.out.println("Digite a distância (em milhas): ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        dis = in.nextDouble();

        result = dis * 1.60934;
        System.out.println("A distância em Km é " + result);
    }
}