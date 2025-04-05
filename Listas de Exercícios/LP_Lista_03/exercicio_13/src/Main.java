//13. Calculadora geométrica: exibir em um menu a opção de escolha entre três formas geométricas:
// círculo, triangulo retângulo ou retângulo. Após a seleção da opção oprograma deverá solicitar
// que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da
// forma selecionada, os resultados devem ser exibidos em seguida.
// Exemplo:
//
//    ```plaintext
//    Menu:
//        1. Círculo
//        2. Triangulo Retângulo
//        3. Retângulo
//    --------------------------
//    Escolha uma opção: 2
//    --------------------------
//    Informe a base: 3
//    Informe a altura: 4
//    --------------------------
//    Área = 6
//    Perímetro = 12
//    ```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, result;
        int option;
        double r, p, a, b, h, c;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("------------------------------------" +
                "\nMENU" +
                "\n------------------------------------" +
                "\n1. Círculo" +
                "\n2. Triangulo Retângulo" +
                "\n3. Retângulo" +
                "\n------------------------------------" +
                "\nEscolha uma opção:");
        option = in.nextInt();
        switch (option){
            case 1:
                System.out.println("Indique o raio do círculo: ");
                r = in.nextDouble();

                p = 2 * Math.PI * r;
                a = Math.PI * (r * r);

                System.out.println("O perimetro é: " + p + " e a área é: " + a);
                break;
            case 2:
                System.out.println("Indique a base do triangulo retângulo: ");
                b = in.nextDouble();
                System.out.println("Indique a altura do triangulo retângulo: ");
                h = in.nextDouble();
                System.out.println("Indique o lado do triangulo retângulo: ");
                c = in.nextDouble();

                p = b + h + c;
                a = (b * h) / 2;

                System.out.println("O perimetro é: " + p + " e a área é: " + a);
                break;
            case 3:
                System.out.println("Indique a base do retângulo: ");
                b = in.nextDouble();
                System.out.println("Indique a altura do retângulo: ");
                h = in.nextDouble();

                p = 2 * (b + h);
                a = b * h;

                System.out.println("O perimetro é: " + p + " e a área é: " + a);
                break;
        }
    }
}