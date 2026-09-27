package Fase6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrasformarApp {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7,7,8));

        List<Integer>dobrados = (List<Integer>) numeros.stream()
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Dobrados: " + dobrados);

        ArrayList<String> nomes = new ArrayList<>(
                Arrays.asList("joao", "maria", "pedro"));
        List<String> maiusculos = (List<String>) nomes.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Mauisculos: " + maiusculos);

        List<Integer> maiorDeDoisDobrado = numeros.stream()
                .filter(n -> n > 2)
                .sorted()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("maiores de dois dobrados: " + maiorDeDoisDobrado);
    }
}
