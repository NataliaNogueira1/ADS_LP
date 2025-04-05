//11. O usuário digita um número inteiro e o programa diz qual o dia da semana correspondente, por exemplo:
//    - 1 – domingo <br>
//    - 2 – segunda-feira <br>
//    - e assim por diante. <br>
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite um número para descobrir seu dia da semana:");
        n = in.nextInt();;

        if (n == 1){
            System.out.println("1 – domingo");
        }else if (n == 2) {
            System.out.println("2 – segunda-feira");
        }else if (n == 3) {
            System.out.println("3 - terça-feira");
        }else if (n == 4) {
            System.out.println("4 - quarta-feira");
        }else if (n == 5) {
            System.out.println("5 - quinta-feira");
        }else if (n == 6) {
            System.out.println("6 - sexta-feira");
        }else if (n == 7) {
            System.out.println("7 - sábado");
        }else{
            System.out.println("Número inválido");
        }
    }
}