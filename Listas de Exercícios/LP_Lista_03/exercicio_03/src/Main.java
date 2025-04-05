//3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela
// a média. Se a média for menor que 50 imprimir “Reprovado” caso
// contrário imprimir “Aprovado”.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segundo nota: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;

        System.out.println("Média: " + mean);
        System.out.println(mean<50?"Reprovado":"Aprovado");
    }
}