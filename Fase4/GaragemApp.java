package Fase4;

public class GaragemApp {
    public static void main(String[] args){
        Carro carro = new Carro("Ford", "Fiesta");
        carro.quantidadeDeCarros = 4;
        System.out.println("Meu carro é da marca " + carro.marca + ", e modelo " + carro.modelo);
    }
}
