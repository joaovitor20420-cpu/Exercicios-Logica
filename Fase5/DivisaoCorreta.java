package Fase5;

import java.util.Scanner;

public class DivisaoCorreta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro e segundo numero de forma seguida para executar a divisão de forma correta: ");
        try{
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if(num2 == 0){
                System.out.println("Erro, não se deve dividir por zero!!");
            }else{
                int rersultado = num1 / num2;
                System.out.println("O resultado é: " + rersultado);
            }
        } catch (Exception e) {
            System.out.println("Erro!!!!!");
        }finally {
            System.out.println("Operação finalizada");
        }
    }
}
