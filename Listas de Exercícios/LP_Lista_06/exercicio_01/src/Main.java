//1. Escreva uma função que receba um número inteiro positivo N e retorne a soma de
// todos os números inteiros de 1 até N. Obs.: N deve ser maior que 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }while (n <= 0);

        System.out.print("\nA soma dos antecessores de " + n + " é " + somador(n));
    }

    public static int somador(int n){
        int soma = 0;
        for (int i=n; i > 0; i--){
            soma = soma + i;
        };
        return soma;
    }

}