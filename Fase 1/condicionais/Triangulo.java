package condicionais;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a < b + c && b < a + c && c < a + b) {
            System.out.println("é um triangulo!!!");
            if (a == b && b == c) {
                System.out.println("É equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("É Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }
    }
}
