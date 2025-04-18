//2. Criar um programa que receba 5 números inteiros digitados
// pelo usuário e ao final exiba o maior e o menor números
// digitados (Obs.: Apenas o maior e o menor número devem ser armazenados).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maior=0, menor=0, number;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            number = scanner.nextInt();

            if (i == 1){
                maior = number;
                menor = number;
            } else {
                if (number > maior){
                    maior = number;
                }
                if (number < menor) {
                    menor = number;
                }
            }
        }

        System.out.println("---------------------------");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        //VERSÃO ALTERNATIVA
        int maiorr = Integer.MIN_VALUE, menorr = Integer.MAX_VALUE, numberr;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numberr = scanner.nextInt();

            if (numberr > maiorr){
                maiorr = numberr;
            }
            if (numberr < menorr) {
                menorr = numberr;
            }
        }

        System.out.println("---------------------------");
        System.out.println("O maior número é: " + maiorr);
        System.out.println("O menor número é: " + menorr);
    }
}