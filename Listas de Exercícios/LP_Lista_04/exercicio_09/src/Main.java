//9. Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação
// por vez.Entre uma operação e outra o usuário deve inserir o resultado da conta,
// se o resultado digitado estiver correto o programa exibe a próxima operação caso
// contrário o jogo é encerrado mostrando a mensagem de que o jogador perdeu (deve
// exibir a opção jogar novamente). Caso o jogador complete toda a tabuada sem erros
// o programa deve exibir uma mensagem parabenizando o jogador (e perguntar se deseja
// jogar novamente).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        char option;
        boolean erro = false; //boolean só armazena true ou false

        Scanner in = new Scanner(System.in);

        do{
            erro = false;
            for (int i=1; i <= 10; i++){
                for (int j=0; j <= 10; j++){
                    System.out.println(i + " x "+ j + " = ");
                    result = in.nextInt();
                    if (result != (i*j)){
                        erro = true;
                        System.out.println("Errou!!!");
                        break;
                    }
                }
                if (erro)
                    break;
                System.out.println("-------------------------");

            }

            if (!erro) // (erro)=true e (!erro) = false, se erro true, a pessoa errou
                System.out.println("Você venceu!!!");
            System.out.println("Jogar novamente? \nSim (S)\nNão (N)");
            option = in.next().charAt(0); // O charAt lê só o primeiro caracter

        }while(option == 's' || option=='S');
        System.out.println("Obrigado por jogar :)");
    }
}