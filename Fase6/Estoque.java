package Fase6;

import java.util.HashMap;

public class Estoque {
    public static void main(String[] args){
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("maça", 50);
        estoque.put("pera", 49);
        estoque.put("Uva", 80);

        System.out.println("Maçãs: " + estoque.get("maça"));
        System.out.println("tem manga? " + estoque.containsKey("manga"));
        for(String produto : estoque.keySet()){
            System.out.println("estoque: "+ produto + "->" + estoque.get(produto));
        }
    }
}
