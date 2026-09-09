package Arrey;

import java.util.Scanner;

public class ContadorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numeroUser = scanner.nextInt();
            int numeros[] = {1, 3, 2, 4, 5, 2, 1, 4, 2, 3, 6, 7, 1, 3, 2, 4};
            int contador = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroUser) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
