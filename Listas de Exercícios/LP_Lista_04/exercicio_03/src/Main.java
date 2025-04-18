//3. Criar um algoritmo que exiba todos os números positivos
// divisíveis por 4 e menores que 200.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            if (i % 4 == 0 && i < 200) {
                System.out.print(i + "\n");
            }
        }
    }
}