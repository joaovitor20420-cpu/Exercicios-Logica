package Arrey;

public class MediaArrey {
    public static void main(String[] args){
        double[] notas = {10.0, 11.0, 50.2, 30.5, 21.5};
        double soma = 0;
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            soma = notas[i] + soma;
             media = soma / notas.length;
        }
        System.out.println(media);
    }
}
