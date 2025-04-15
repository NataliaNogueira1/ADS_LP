//1. Declare e inicialize um vetor de 10 posições,
// em seguida imprima este vetor em ordem inversa.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,6,5,2,1,4,3,8,9,11};

        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}