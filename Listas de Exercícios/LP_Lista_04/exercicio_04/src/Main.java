//4. Faça um programa que apresente na tela a tabela de conversão de Graus
// Celsius para Fahrenheit, de -80ºC até 80ºC com um incremento de 10ºC.
// F = 9/5 * C+32
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = -80; i <= 80; i+=10) {
            double f;
            f = (i * 9/5) + 32;

            System.out.print(i+ "ºC: "+ f + "ºF\n");
        }
    }
}