//2. Criar um programa que receba 5 números inteiros digitados
// pelo usuário e ao final exiba o maior e o menor números
// digitados (Obs.: Apenas o maior e o menor número devem ser armazenados).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitação do primeiro número
        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        // Inicializa maior e menor com o primeiro número lido
        int maior = numero;
        int menor = numero;
        // Leitura e comparação dos próximos números
        for (int i = 2; i <= 5; ++i) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();
            // Atualização do maior e menor, se necessário
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        // Exibição do resultado
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}