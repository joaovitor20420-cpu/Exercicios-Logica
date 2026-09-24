package Fase5;

import java.util.Scanner;

public class TratadorDeErro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        try{
            int idade = scanner.nextInt();
            System.out.println("Que legal!!! Sua idade é " + idade + ".");
        } catch (Exception e) {
            System.out.println("Erro!!");
        }
    }
}
