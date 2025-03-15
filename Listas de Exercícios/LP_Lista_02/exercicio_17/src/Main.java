//17. Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double i, a, t, result;

        System.out.println("Velocidade inicial: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        i = in.nextDouble();

        System.out.println("Aceleração: ");
        a = in.nextDouble();

        System.out.println("Tempo de percurso: ");
        t = in.nextDouble();

        result = i + a * t;
        System.out.println("A velocidade é: " + result);
    }
}