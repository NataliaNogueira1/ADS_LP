// RECURSIVO
// 2. Implemente uma função para calcular o fatorial de um número inteiro N digitado pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        System.out.print("\nO fatorial de " + n + " é " + fatorador(n));
    }

    public static long fatorador(int n){
        if(n==1 || n==0)
            return 1;

        return n * fatorador(n-1);
    }

}