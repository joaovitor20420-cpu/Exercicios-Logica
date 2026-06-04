import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = input.nextDouble();
        System.out.println("Digite o valor entregue: ");
        double entregue = input.nextDouble();
        double troco = (entregue - compra);
        input.close();

        if (troco == 0 || entregue == compra) {
            System.out.println("Não houve troco.");
        } else if (entregue < compra) {
            System.out.println("Valor insuficiente!");
        } else {
            System.out.println("O troco é: " + troco);
        }
    }
}