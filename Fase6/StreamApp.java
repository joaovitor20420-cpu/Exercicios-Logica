package Fase6;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamApp {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(11, 12, 30, 1, 5, 16));

        System.out.println("Numeros pares: ");
        numeros.stream()
                .filter(n -> n % 2 ==0)
                .forEach(n -> System.out.println(n));
        System.out.println("Numeros em ordem: ");
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.println(n));

        System.out.println("Numeros pares em ordem: ");
        numeros.stream()
                .filter(n -> n % 2 ==0)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
