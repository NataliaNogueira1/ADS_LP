//Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, result;

        System.out.println("Digite o coeficiente a: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        b = in.nextDouble();

        if(a!= 0 && b!= 0) {
            result = b / a;
            System.out.println("O resultado é " + result);
        } else {
            System.out.println("A equação não é do primeiro grau");
        }
    }
}