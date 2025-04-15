public class Main {
    public static void main(String[] args) {
        //Declaração com inicialização
        int [] numbers = {0,6,5,2,1};

        for (int i=0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for (int pointer:numbers) {
            System.out.println(pointer);
        }


    }
}