//10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo,
// onde $n$ é um número fornecido pelo usuário.
//    >Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros,
//    começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma
//    dos dois anteriores.
//    > - Exemplo:
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 2; i < n; i++) {
            int next = primeiro + segundo;
            System.out.print(next + " ");
            primeiro = segundo;
            segundo = next;
        }
    }
}