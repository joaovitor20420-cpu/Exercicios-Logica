package Fase4;

import java.util.ArrayList;

public class CoralDeAnimais {
    public static void main(String[] args){
        ArrayList<Animal> coral = new ArrayList<>();
        coral.add(new Gato());
        coral.add(new Cachorro());

        for(int i = 0; i < coral.size(); i++){
            Animal bichoDaVez = coral.get(i);
            bichoDaVez.emitirSom();
        }



    }
}
