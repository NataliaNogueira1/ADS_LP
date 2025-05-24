//3. Crie uma função para calcular a potência de um número inteiro x elevado a uma
// potência inteira y. Os valores de x e y serão fornecidos pelo usuário.
// y deve ser maior ou igual a zero.
// Proibido utilizar Math.pow(x,y)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite a base: ");
            x = scanner.nextInt();
            System.out.print("Digite o expoente: ");
            y = scanner.nextInt();
        }while (y < 0);

        System.out.print(x + " elevado a " + y + " é " + potenciador(x, y));
    }

    public static int potenciador(int x, int y){
        int resultado = 1;
        for (int i=1; i <= y; i++){
            resultado = resultado * x;
        };
        return resultado;
    }



}