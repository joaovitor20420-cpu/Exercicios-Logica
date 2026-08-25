package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            int tabuada = numero * i;
            System.out.println(numero + "*" + i +"= " + tabuada );
        }
    }
}
