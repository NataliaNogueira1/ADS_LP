//2. O usuário entra com dois números inteiros e o programa indica qual o maior.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite o primeiro número: ");
        number1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        number2 = in.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }else if (number1 < number2){
            System.out.println(number1 + " < " + number2);
        }else{
            System.out.println(number1 + " = " + number2);
        }
    }
}