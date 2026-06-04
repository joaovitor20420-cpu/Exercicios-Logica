import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em KG:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        double imc = (peso / (altura * altura));
        System.out.println("Seu IMC é: " + imc);
        scanner.close();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
