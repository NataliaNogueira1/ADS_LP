//6. Em um sistemas de caixa eletrônico o usuário deve escolher entre
// as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive.
// Crie um algoritmo que valide a entrada do usuário exibindo a opções
// escolhida ou a mensagem de opção inválida casoo usuário entre com um
// número fora do range estabelecido.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("**OPÇÕES**");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("Digite sua opção:");
        n = in.nextInt();

        if (n == 5){
            System.out.println("Escolhido:" + n);
        }else if (n == 6){
            System.out.println("Escolhido:" + n);
        }else if (n == 7){
            System.out.println("Escolhido:" + n);
        }else if (n == 8){
            System.out.println("Escolhido:" + n);
        }else if (n == 9){
            System.out.println("Escolhido:" + n);
        }else{
            System.out.println("Opção inválida");
        }
    }
}