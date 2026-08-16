package Strings;

public class CamelCase {
    public static void main(String[] args){
        String frase = "eu sou o joão";
        boolean ligado = false;

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == ' '){
                ligado = true;
            }else if (ligado){
                System.out.print(Character.toUpperCase(c));
                ligado = false;
            }else{
                System.out.print(c);

            }

        }
    }
}
