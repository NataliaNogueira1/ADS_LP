//4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe
// na tela a média. Se a média for maior ou igual a 50,
// exibir “Aprovado”, caso contrário solicitar ao usuário a nota
// da prova de recuperação, tirar nova média entre a média anterior
// e a prova de recuperação,se a nova média for menor que 50 exibir
// “Reprovado” caso contrário exibir “Aprovado”.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean, recovery, meane;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segundo nota: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;
        System.out.println("Média: " + mean);

        if (mean>=50){
            System.out.println("Aprovado");
        }else{
            System.out.println("Digite a nota da recuperação:");
            recovery = in.nextDouble();

            meane = (mean + recovery)/2;
            System.out.println("Nova média: " + mean);

            if (meane < 50){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }

    }
}