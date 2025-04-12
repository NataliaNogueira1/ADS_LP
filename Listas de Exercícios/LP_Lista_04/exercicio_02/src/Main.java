//2. Criar um programa que receba 5 números inteiros digitados
// pelo usuário e ao final exiba o maior e o menor números
// digitados (Obs.: Apenas o maior e o menor número devem ser armazenados).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        n = in.nextInt();

        for (int i = 0; i < 11; i++){
            System.out.println(n+" x "+i+" = "+ (i*n));
        }
    }
}