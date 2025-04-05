//1. Receba um número real e caso ele seja positivo imprima sua raiz
// quadrada, casocontrário imprima a mensagem: “Valor inválido!”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, sqrt;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite um número: ");
        number = in.nextDouble();

        if (number >= 0) {
            sqrt = Math.sqrt(number);
            System.out.println("O quadrado de " + number + " é " + sqrt);
        }else{
            System.out.println("Valor inválido! Não existe raiz quadrada de valor negativo");
        }
    }
}