public class Main {
    public static void main(String[] args) {
        //Declaração com inicialização
        int [][] numbers = new int [2][2];
        int [][] matriz = {{5,8,9},{9,6,4},{1,2,3}};

        for (int [] linha:matriz){
            for(int valor:linha)
                System.out.print(valor + " ");
            System.out.println();
        }

    }
}