package Arrey;

public class InverterArray {
    public static void main(String[] args){
        int numero[] = {1, 2, 3, 4, 5};
        int temp = numero[0];
        numero[0] = numero[4];
        numero[4] = temp;

        int temp2 = numero[1];
        numero[1] = numero[3];
        numero[3] = temp2;

        for(int i = 0;i < numero.length; i++){
            System.out.println(numero[i]);
        }
    }
}
