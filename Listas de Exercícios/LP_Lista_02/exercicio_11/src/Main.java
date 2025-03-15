//11. Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp, result;

        System.out.println("Digite a temperatura em graus celsius: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        temp = in.nextDouble();

        result = (temp * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é " + result);
    }
}