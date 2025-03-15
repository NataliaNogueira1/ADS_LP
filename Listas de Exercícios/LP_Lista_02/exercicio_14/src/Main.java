//14. Receber a base e a altura de um triângulo retângulo e calcular sua área.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, result;

        System.out.println("Altura do triângulo retângulo: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        a = in.nextDouble();

        System.out.println("Base do triângulo retângulo: ");
        b = in.nextDouble();

        result = (a * b)/2;
        System.out.println("A área é de aproximadamente: " + result);
    }
}