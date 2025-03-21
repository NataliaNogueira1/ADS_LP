//20. Descobrir uma equação do segundo grau a partir de suas raízes:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, x2, soma, produto;

        System.out.println("Digite x1: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        x1 = in.nextDouble();

        System.out.println("Digite x2: ");
        x2 = in.nextDouble();

        soma = x1 + x2;
        produto = x1 * x2;

        System.out.println("A equação do segundo grau é: x² - " + soma + "x + " + produto + " = 0");
    }
}