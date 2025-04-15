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
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                double s, n;

                System.out.println(i+" x "+j+" = ");
                System.out.println("Digite um número:");
                n = in.nextDouble();

                s = i*n;

                if (n != s){
                    String r;
                    System.out.println("Perdeu!");
                    break;
                    System.out.println("Jogar novamente? (S/N)");
                    r = in.nextLine();

                        if( r == "S"){
                            continue;
                        }else if(r == "N"){

                        }else{
                            System.out.println("Inválido");
                        }
                }else{
                    continue;
                }
            }
            System.out.println("-------------------------");
        }
    }
}