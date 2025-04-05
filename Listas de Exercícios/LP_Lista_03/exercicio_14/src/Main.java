//14. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a
// forma de pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de
// pagamento o sistema deve mostrar o total a pagar que deve seguir as seguintes regras:
//
//    - **Débito:** Conceder desconto de 5%.
//    - **Pix:** Conceder desconto de 10%.
//    - **Crédito:** taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de
//    5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).
//
//    Exemplo:
//
//    ```plaintext
//    Insira o valor da compra: 1000,00
//    ----------------------------------
//    Menu:
//        1. Débito
//        2. Pix
//        3. Crédito
//    ----------------------------------
//    Escolha a forma de pagamento: 3
//    ----------------------------------
//    Crédito Selecionado
//    ----------------------------------
//    Escolha o número de parcelas: 6
//    Valor final da compra: R$ 1050,00
//    ```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option, p;
        double price, total;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Insira o valor da compra: ");
        price = in.nextInt();
        System.out.println("------------------------------------" +
                "\nMENU" +
                "\n------------------------------------" +
                "\n1. Débito" +
                "\n2. Pix" +
                "\n3. Crédito" +
                "\n------------------------------------" +
                "\nEscolha uma opção:");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("\n------------------------------------");
                System.out.println("\nDébito selecionado");
                System.out.println("\n------------------------------------");

                total = price - (price * 0.05);
                System.out.println("\nValor final da compra: " + total);
                break;
            case 2:
                System.out.println("\n------------------------------------");
                System.out.println("\nPix selecionado");
                System.out.println("\n------------------------------------");

                total = price - (price * 0.1);
                System.out.println("\nValor final da compra: " + total);
                break;
            case 3:
                System.out.println("\n------------------------------------");
                System.out.println("\nCrédito Selecionado");
                System.out.println("\n------------------------------------");
                System.out.println("\nEscolha o número de parcelas: ");
                p = in.nextInt();

                if (p <= 4){
                    total = price + (price * 0.02);
                    System.out.println("\nValor final da compra: " + total);
                }else if (p <= 10){
                    total = price + (price * 0.05);
                    System.out.println("\nValor final da compra: " + total);
                }else{
                    System.out.println("\nNúmero de parcelas inválido");
                }
                break;
        }
    }
}