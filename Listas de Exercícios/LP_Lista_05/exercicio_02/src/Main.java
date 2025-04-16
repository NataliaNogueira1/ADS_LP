//2. Declare e inicialize um vetor de 10 posições, em seguida
// percorra este vetor alterando seus valores conforme a seguinte
// regra: some 2 a todos os valores situados em posições com índice
// par e para as posições de índice ímpar multiplique seu valores por 2.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {89,6,5,2,1,4,3,8,9,11};

        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                int s;
                System.out.println(i+"\n"+numbers[i]);
                s = numbers[i] + 2;
                System.out.println(s);
                System.out.println("----------");
            }else{
                int s;
                System.out.println(i+"\n"+numbers[i]);
                s = numbers[i] + 2;
                System.out.println(s);
                System.out.println("----------");
            }
        }
    }
}