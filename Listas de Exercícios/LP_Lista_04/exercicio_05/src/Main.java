//5. Calcule o fatorial de um número determinado pelo usuário usando for.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, fatorial=1;
        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite um número:");
        n = in.nextInt();

        System.out.println(n + "! = ");
        while (n>1){
            fatorial = fatorial * n;
            n--;
        }
        System.out.println(fatorial);
    }
}