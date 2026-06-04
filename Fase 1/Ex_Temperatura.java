import java.util.Scanner;

public class Ex_Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\n" + celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit.");
        scanner.close();
    }

}
