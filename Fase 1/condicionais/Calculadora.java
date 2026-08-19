package condicionais;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Digite o primeiro numero: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = scanner.nextInt();
        System.out.println("Digite a operação: ");
        String operacao = scanner.next();


            if (operacao.equals("+")) {
                double resultado = a + b;
                System.out.println(resultado);
            } else if (operacao.equals("-")) {
                double resultado = a - b;
                System.out.println(resultado);
            } else if (operacao.equals("/")) {
                if ( b == 0) {
                    System.out.println("Não pode fazer divisão por zero!!!");
                } else {
                    double resultado = a / b;
                    System.out.println(resultado);
                }
            } else if (operacao.equals("*")) {
                double resultado = a * b;
                System.out.println(resultado);
            }
        }
    }
 }