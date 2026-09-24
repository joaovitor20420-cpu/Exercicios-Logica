package Fase5;

import java.util.Scanner;

public class ValidadorDeIdade {
    public static void validarIdade(int idade) throws Exception {
        if(idade < 10 || idade > 100){
            throw new Exception("Idade inavlida: " + idade);
        }
        System.out.println("Idade valida: " + idade);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        try{
            ValidadorDeIdade.validarIdade(idade);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Validação finalizada!!");
        }
    }
}

