public class StringInvertida {
    public static void main(String[] args){
        String palavra = "Java";
        String resultado = "";
        for(int i = palavra.length() - 1; i >= 0; i--) {
            resultado = resultado + palavra.charAt(i);
            }
        System.out.println(resultado);
    }
}