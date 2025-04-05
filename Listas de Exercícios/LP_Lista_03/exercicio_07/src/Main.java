//7. Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução
// (x1 e x2).
// Equação do segundo grau: ax^2+bx+c = 0
//. Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        System.out.println("Digite o coeficiente a: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        c = in.nextDouble();

        delta = (b * b) + (-4 * (a * c));

        if (delta >= 0) {
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta não possui raiz");
        }
    }
}