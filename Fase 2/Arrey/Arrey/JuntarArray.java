package Arrey;

public class JuntarArray {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12, 13, 14, 15};

            int tamanhoFinal = array1.length + array2.length;
            int[] arreyFinal = new int[tamanhoFinal];

            for(int i = 0;i < array1.length; i++){

                arreyFinal[i] = array1[i];
            }
            for(int i = 0; i < array2.length; i++) {

                int posicaoDeDestino = array1.length + i;

                arreyFinal[posicaoDeDestino] = array2[i];
            }
            for(int i = 0; i < arreyFinal.length; i++){
                System.out.println(arreyFinal[i]);
            }
    }
}
