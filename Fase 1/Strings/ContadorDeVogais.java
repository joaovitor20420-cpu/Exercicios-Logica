package Strings;

public class ContadorDeVogais {
    public static void main(String[] args) {


    String frase = "ola";
    int contador = 0;
        for( int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                contador  = contador + 1;
            }
        }
        System.out.println(contador);
}
}
