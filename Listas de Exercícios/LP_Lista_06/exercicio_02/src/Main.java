//2. Implemente uma função para calcular o fatorial de um número inteiro N digitado pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }while (n <= 0);

        System.out.print("\nO fatorial de " + n + " é " + fatorador(n));
    }

    public static long fatorador(int n){
        long resultado = 1;
        for (int i=1; i <= n; i++){
            resultado = resultado * i;
        }
        return resultado;

        // Versão Cainã:
//        long resultado = 1;
//        for (int i=n; i > 1; i--){
//            resultado = resultado * i;
//        }
//        return resultado;
    }

}