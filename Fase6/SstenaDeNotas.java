package Fase6;

import java.util.HashMap;
import java.util.List;

public class SstenaDeNotas {

    public static void main(String[] args) {
        HashMap<String, Double> turma = new HashMap<>();
        turma.put("Joao", 10.0);
        turma.put("marcos", 9.2);
        turma.put("Maria", 4.2);
        turma.put("Pedro", 7.0);
        turma.put("Ana", 9.8);
        turma.put("Carlos", 3.5);
        turma.put("Julia", 6.0);
        System.out.println("=== Notas dos aprovados (ordenadas) ===");

        turma.values().stream()
                .filter(nota -> nota >= 5)
                .sorted()
                .forEach( nota -> System.out.println("Notas dos aprovados Ordenada: " + nota ));

        double media = turma.values().stream()
                .mapToDouble(nota -> nota )
                .average()
                .orElse(0.0);
        System.out.println("Media da turma: " + media);

                 turma.entrySet().stream()
                .filter(entry -> entry.getValue() < 5)
                .forEach(entry -> System.out.println(entry.getKey() + " nota: " + entry.getValue()));
    }
}