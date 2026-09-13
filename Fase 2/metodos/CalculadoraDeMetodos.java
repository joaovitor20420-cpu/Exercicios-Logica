import java.util.Scanner;

public class CalculadoraDeMetodos {
    public static double soma(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite a operação: ");

        String op = scanner.next();

        System.out.println("Digite o segundo nuumero: ");

        Double num2 = scanner.nextDouble();

        if(op.equals("+")){
           System.out.println("resiltado: " +  soma(num1, num2));
        } else if (op.equals("-")) {
            System.out.println("resiltado: " +  subtrair(num1, num2));
        } else if(op.equals("*")){
            System.out.println("resiltado: " +  multiplicar(num1, num2));
        } else if (op.equals("/")) {
            if(num2 == 0){
                System.out.println("Não se poode fazer divisão por zero!");
            }else {
                System.out.println("resiltado: " +  dividir(num1, num2));
            }
        }
    }
}
