package Arrey;

import java.util.Scanner;

public class BuscarNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] aluno = {"joao", "Ricardo", "Paulo", "Eduarda", "Manuel"};

        while (true) {
            boolean achou = false;
            String nomeBuscado = scanner.next();

            for (int i = 0; i < aluno.length; i++) {
                if (aluno[i].equalsIgnoreCase(nomeBuscado)) {
                    achou = true;
                }
            }

                if (achou == true) {
                    System.out.println("Aluno encontrado no sistema");
                } else {
                    System.out.println("Aluno NÃO consta no sistema");
                }
            }

    }
}
