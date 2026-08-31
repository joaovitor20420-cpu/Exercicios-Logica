package loops;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
        int n = scanner.nextInt();
        boolean flag = true;
            if (n <= 1) {
                flag = false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("É primo");
            } else {
                System.out.println("não é primo");
            }
        }
    }
}
