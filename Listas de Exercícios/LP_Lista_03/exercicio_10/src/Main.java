//10. Receber três números inteiros e exibi-los em ordem crescente.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite três números inteiros separados por espaço:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt()   ;

        if (n1 > n2 && n1 > n3 && n2 > n3){
            System.out.println("Seus números em ordem crescente: " + n3 + ", "+ n2 + " e "+ n1 + ".");
        }else if (n1 > n3 && n2 < n3) {
            System.out.println("Seus números em ordem crescente: " + n2 + ", "+ n3 + " e "+ n1 + ".");
        }else if (n1 < n3 && n2 > n3) {
            System.out.println("Seus números em ordem crescente: " + n1 + ", "+ n3 + " e "+ n2 + ".");
        }else if (n1 < n2 && n1 > n3) {
            System.out.println("Seus números em ordem crescente: " + n3 + ", "+ n1 + " e "+ n1 + ".");
        }else if (n1 > n2 && n1 < n3) {
            System.out.println("Seus números em ordem crescente: " + n2 + ", "+ n1 + " e "+ n3 + ".");
        }else{
            System.out.println("Seus números em ordem crescente: " + n1 + ", "+ n2 + " e "+ n3 + ".");
        }
    }
}