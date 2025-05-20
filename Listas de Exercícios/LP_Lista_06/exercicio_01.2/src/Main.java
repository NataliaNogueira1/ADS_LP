// RECURSIVO
// 1. Escreva uma função que receba um número inteiro positivo N e retorne a soma de
// todos os números inteiros de 1 até N. Obs.: N deve ser maior que 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = scanner.nextLong();
        }while (n <= 0);

        System.out.print("\nA soma dos antecessores de " + n + " é " + somador(n));
    }

    public static long somador(long n){
        if(n==1)
            return 1;

        return n + somador(n-1);
    }

}