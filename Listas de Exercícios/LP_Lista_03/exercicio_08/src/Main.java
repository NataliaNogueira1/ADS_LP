//8. O usuário entra com um número inteiro e o programa indica se o
// número é ímpar ou par.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite um número:");
        n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("O número " + n + " é par");
        }else{
            System.out.println("O número " + n + " é ímpar");
        }
    }
}