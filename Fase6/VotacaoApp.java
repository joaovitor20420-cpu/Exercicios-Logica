package Fase6;

import java.util.HashSet;

public class VotacaoApp {
    public static void main(String[] args){
        HashSet<String> votos = new HashSet<>();
        votos.add("João");
        votos.add("Maria");
        votos.add("Pedro");
        votos.add("Pedro");

        System.out.println("Total de votantes unicos: " + votos.size());
        System.out.println("Pedro votou? " + votos.contains("Pedro"));
        System.out.println("João votou? " + votos.contains("João"));
        System.out.println("Maria votou? " + votos.contains("Maria"));

        for(String votante : votos){
            System.out.println("Pessoas que votaram: " + votante);
        }
    }
}
