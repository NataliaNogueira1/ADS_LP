//6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores
// armazenados neste mesmo vetor.
//**Restrição:** utilizar apenas um vetor e uma variável auxiliar

public class Main {
    public static void main(String[] args) {
        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aux = 0;

        for (int i=0; i < vetor.length/2; i++){
            aux = vetor[vetor.length - 1 -i];
            vetor[vetor.length - 1 - i] = vetor[i];
            vetor[i] = aux;
        }

        for (int valor : vetor) {
            System.out.print(valor + ", ");
        }
    }
}