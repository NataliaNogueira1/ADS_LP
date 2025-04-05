//9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo.
// Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
//    >**Condição de existência de um triângulo**: <br>
//    A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos
//    outros dois lados e maior que diferença entre essas mesmas medidas. <br>
//    - **Triângulo equilátero:** possui todos os lados iguais.
//    - **Triângulo isósceles:** possui apenas dois lados iguais.
//    - **Triângulo escaleno**: todos os lados são diferentes.10.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, number3, s1, s2, s3, s4, s5, s6;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite o lado 1:");
        number1 = in.nextDouble();

        System.out.println("Digite o lado 2:");
        number2 = in.nextDouble();

        System.out.println("Digite o lado 3:");
        number3 = in.nextDouble();

        s1 = number1 + number2;
        s2 = number1 + number3;
        s3 = number2 + number3;

        s4 = number1 - number2;
        s5 = number1 - number3;
        s6 = number2 - number3;

        if (s6 < number1 && number1 < s3 && s5 < number2 && number2 < s2 && s4 < number3 && number3 < s1){
            if (number1 == number2 && number2 == number3){
                System.out.println("É um triângulo equilátero");
            }else if (number1 != number2 && number2 != number3 && number1 != number3){
                System.out.println("É um triângulo escaleno");
            }else{
                System.out.println("É um triângulo isósceles");
            }
        }else{
            System.out.println("Não é um triângulo");
        }
    }
}