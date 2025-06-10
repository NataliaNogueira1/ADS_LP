// RECURSIVA
// 4. Escreva uma função em Java para verificar se uma *String* é um palíndromo.
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

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.print("É palíndromo");
        } else {
            System.out.print("Não é palíndromo");
        }

    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }
}
