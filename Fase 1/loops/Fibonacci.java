package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            int a = 0;
            int b = 1;
            if (n < 10) {
                System.out.println("digite numerosde 10 prq cima para ver a sequencia completa!!");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println(a);
                    int c = a + b;
                    a = b;
                    b = c;
                }

            }
        }
    }
}
