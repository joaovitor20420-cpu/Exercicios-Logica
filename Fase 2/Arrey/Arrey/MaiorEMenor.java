package Arrey;

public class MaiorEMenor{
    public static void main(String[] args){
        int[] numeros = {40, 30, 50, 10, 45};
        int menor = numeros[0];
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
            }else if(numeros[i] > maior){
                maior =numeros[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}