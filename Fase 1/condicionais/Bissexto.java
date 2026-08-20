package condicionais;

import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Digite o ano a ser consultado: ");
        int ano = scanner.nextInt();

            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                System.out.println("Esse ano é bissexto");
            } else {
                System.out.println("Esse ano nao é bissexto");
            }
        }
    }
}
