//9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
//    >**Condição de existência de um triângulo**: <br>
//    A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas. <br>
//    - **Triângulo equilátero:** possui todos os lados iguais.
//    - **Triângulo isósceles:** possui apenas dois lados iguais.
//    - **Triângulo escaleno**: todos os lados são diferentes.10.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite um número:");
        n = in.nextDouble();

        if (n % 2 == 0){
            System.out.println("O número " + n + " é par");
        }else{
            System.out.println("O número " + n + " é ímpar");
        }
    }
}