package Strings;

import java.util.Scanner;


public class Palindromo {

    public static void main(String[] args){
        while(true) {
            System.out.println("Digite uma palavra: ");
            Scanner scanner = new Scanner(System.in);
            String palavra = scanner.nextLine();
            String inversao = "";

            for (int i = palavra.length() - 1; i >= 0; i--) {
                inversao = inversao + palavra.charAt(i);
            }
            if (palavra.equals(inversao)) {
                System.out.println("A palavra é palidromo = " + inversao);
            } else {
                System.out.println("A palavra não é um palidromo = " + inversao);

            }
        }
    }
}
