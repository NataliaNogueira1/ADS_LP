//15. Elabore um programa que simule o funcionamento de uma máquina de café, o usuário entra
// com o valor em reais, a máquina então apresenta um menu com as opções disponíveis e
// seus respectivos preços. Ao selecionar uma das opções a máquina informa a bebida
// selecionada e o troco calculado.
//
//    Exemplo:
//
//    ```plaintext
//    Insira o dinheiro: 5,00
//    ------------------------------
//    Menu:
//        1. Café Expresso R$ 0,50
//        2. Café Longo R$ 1,00
//        3. Capuccino R$ 2,50
//        4. Chocolate R$ 2,00
//    ------------------------------
//    Escolha uma opção: 3
//    ------------------------------
//    Bebida selecionada: Capuccino
//    Seu Troco: R$ 2,50
//    ```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double din, troco;
        int option;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Insira o dinheiro: ");
        din = in.nextDouble();

        System.out.println("------------------------------------" +
                "\nMENU" +
                "\n------------------------------------" +
                "\n1. Café Expresso R$ 0,50" +
                "\n2. Café Longo R$ 1,00" +
                "\n3. Capuccino R$ 2,50" +
                "\n4. Chocolate R$ 2,00" +
                "\n------------------------------------" +
                "\nEscolha uma opção:");
        option = in.nextInt();
        switch (option){
            case 1:
                if (din >= 0.5) {
                    System.out.println("\n------------------------------------");
                    System.out.println("\nBebida selecionada: Café Expresso");

                    troco = din - 0.50;
                    System.out.printf("\nSeu Troco: R$ %.2f", troco);
                }else{
                    System.out.println("\nValor inserido insuficiente");
                }
                break;
            case 2:
                if (din >= 1.0) {
                    System.out.println("\n------------------------------------");
                    System.out.println("\nBebida selecionada: Café Longo");

                    troco = din - 1.00;
                    System.out.printf("\nSeu Troco: R$ %.2f", troco);
                }else{
                    System.out.println("\nValor inserido insuficiente");
                }
                break;
            case 3:
                if (din >= 2.5) {
                    System.out.println("\n------------------------------------");
                    System.out.println("\nBebida selecionada: Capuccino");

                    troco = din - 2.50;
                    System.out.printf("\nSeu Troco: R$ %.2f", troco);
                }else{
                    System.out.println("\nValor inserido insuficiente");
                }
                break;
            case 4:
                if (din >= 2.0) {
                    System.out.println("\n------------------------------------");
                    System.out.println("\nBebida selecionada: Chocolate");

                    troco = din - 2.00;
                    System.out.printf("\nSeu Troco: R$ %.2f", troco);
                }else{
                    System.out.println("\nValor inserido insuficiente");
                }
                break;
            default:
                System.out.println("\nOpção inválida");
                break;
        }
    }
}