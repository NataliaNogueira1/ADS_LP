//1. Criar um programa que receba um valor do usuário e exiba a sua tabuada multiplicando o
// número digitado pela sequência de 0 a 10.
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