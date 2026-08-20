package condicionais;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int nota = scanner.nextInt();
            if(nota >= 90 && nota <= 100){
                System.out.println("nota é A");
            }else if(nota >= 80 && nota < 90){
                System.out.println("nota é B");
            } else if( nota >= 70 && nota < 80){
                System.out.println("nota é C");
            } else if(nota >= 60 && nota < 70){
                System.out.println("nota é D");
            }else if( nota >= 0 && nota < 60){
                System.out.println("nota é F");
            }else{
                System.out.println("Essa nota não existe");
            }
        }
    }
}
