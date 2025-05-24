//4. Escreva uma função em Java para verificar se uma *String* é um palíndromo.
// A *String* deve ser digitada pelo usuário. Um palíndromo é uma palavra, frase
// ou sequência que se lê da mesma forma de trás para frente.
//Exemplos: “ovo”, “tenet”, “abasedotetodesaba”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        boolean verificacao = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui: ");
        word = scanner.nextLine();

        verificacao = verificador(word);

        if (verificacao){
            System.out.print("É palíndromo");
        }else{
            System.out.print("Não é palíndromo");
        }

    }
    public static boolean verificador(String word){
        char[] array = word.toCharArray();
        char [] arrayReverse = new char[array.length];

        for (var i=array.length-1; i >= 0; i--){
            arrayReverse[i] = array[array.length - 1 - i];
        }

        for (var i=0; i < array.length; i++){
            if (array[i] != arrayReverse[i]){
                return false;
            }
        }
        return true;
    }

}