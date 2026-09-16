import java.util.Scanner;

public class ValidarSenha {

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }
        boolean TemNumero = false;
        char letra = 0;
        for (int i = 0; i < senha.length(); i++) {
            letra = senha.charAt(i);

            if (letra >= '0' && letra <= '9') {
                TemNumero = true;
            }

        }
        return TemNumero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Digite sua senha: ");
            String senha = scanner.next();

            if (validarSenha(senha)) {
                System.out.println("Sua senha é forte!!");
            } else {
                System.out.println("Sua senha é fraca. ");
            }
        }
    }
}
