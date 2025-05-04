//6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores
// armazenados neste mesmo vetor.
//**Restrição:** utilizar apenas um vetor e uma variável auxiliar

public class Main {
    public static void main(String[] args) {
        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] aux = new int[vetor.length];

        for (int i=0; i < vetor.length; i++){
            aux[i] = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
        }
;
        System.out.println("Vetor 1:");
        for (int i = 0; i < aux.length; i++){
            System.out.print(aux[i]+", ");
        }

        System.out.println("\nVetor 2:");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+", ");
        }

    }
}