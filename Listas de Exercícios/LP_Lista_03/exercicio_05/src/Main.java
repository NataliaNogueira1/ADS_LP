//5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
//    - A se a média >= 8.5
//    - B se a média >= 7 e média < 8.5
//    - C se a média >= 5 e média < 7
//    - D se a média < 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segundo nota: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;
        System.out.println("Média: " + mean);

        if (mean < 5){
            System.out.println("Conceito: D");
        }else if (mean >= 5 && mean < 7){
            System.out.println("Conceito: C");
        }else if (mean >= 7 && mean < 8.5){
            System.out.println("Conceito: B");
        }else{
            System.out.println("Conceito: A");
        }
    }
}