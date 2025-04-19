//3. Crie um programa que contenha um vetor de inteiros de 10 posições
// (inicializar o vetor junto com sua declaração). O programa deve solicitar
// ao usuário um número inteiro(armazenar em uma variável comum inteira) e
// então realizar uma busca dentro do vetor.Caso a variável digitada exista
// dentro do vetor, exibir sua posição no vetor caso contrário exibir a
// mensagem “Valor não encontrado”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {89,6,5,2,1,4,3,8,9,11};
        int n, i, p = 0;
        boolean exist = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        n = scanner.nextInt();

        for (i = 0; i < numbers.length; i++){
            if (numbers[i] == n){
                exist = true;
                p = i;
            }
        }
        if (exist){
            System.out.println("Parabéns o número "+n+" existe no vetor!");
            System.out.println("Posição no vetor: "+ p);
        }
        if (!exist){
            System.out.println("Valor não encontrado :(");
        }
    }
}