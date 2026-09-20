package Fase4;

public class ZooApp {
    public static void main(String[] args){
        Cachorro dog = new Cachorro();
        dog.nome = "Tiger";
        dog.idade = "5";

        dog.emitirSom();

        Gato cat = new Gato();
        cat.nome = "Garfield";
        cat.idade = "3";

        cat.emitirSom();
    }
}
