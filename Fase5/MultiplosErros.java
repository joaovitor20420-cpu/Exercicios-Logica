package Fase5;

import java.util.Scanner;

public class MultiplosErros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numeros = {12, 24, 26};
            int indice = scanner.nextInt();
            int divisor = scanner.nextInt();

            int resultado = numeros[indice] / divisor;
        }catch(ArithmeticException e){
            System.out.println("Erro de matematica");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Voce escolheu um indice que não existe no arrey!!");
        }catch (Exception e) {
            System.out.println("Erro nesperado");
        }
    }
}
