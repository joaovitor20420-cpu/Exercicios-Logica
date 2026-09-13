package Arrey;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompra {
    public static void main(String[] args){
        ArrayList<String> ListaDeCompra = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();
            if(text.equalsIgnoreCase("ver")){
                for(int i = 0; i < ListaDeCompra.size(); i++){
                    System.out.println(ListaDeCompra.get(i));
                }
            }else if(text.equalsIgnoreCase("remover")){
                System.out.println("Qual item deseja remover? ");
                String item = scanner.nextLine();
                ListaDeCompra.remove(item);
            }else if(text.equalsIgnoreCase("sair")){
                System.out.println("Lista encerrda!!");
                break;
            } else{
                ListaDeCompra.add(text);
                System.out.println("Item adcionado!");

            }
        }
    }
}
